-- New script in system-localhost 9.
-- Connection Type: dev 
-- Url: jdbc:oracle:thin:@//localhost:1521/XE
-- workspace : D:\multicampus-workspace\03_database
-- Date: 2024. 5. 17.
-- Time: 오전 9:35:27

-- 1. 직원의 이름과 이메일, 이메일 길이를 출력하시오
--		  직원명	    이메일		이메일길이
--	ex) 	홍길동 , hong  	  13
SELECT 
	FIRST_NAME || ' ' || LAST_NAME,
	EMAIL,
	LENGTH(EMAIL) 
FROM EMPLOYEES;

-- 2. 2001 AND 2005년에 고용된  직원명과 입사년도, 보너스 값을 출력하시오 
--	그때 보너스 값이 null인 경우에는 0 이라고 출력 되게 만드시오
SELECT 
	  FIRST_NAME || ' '  || LAST_NAME,
	  EXTRACT(YEAR FROM HIRE_DATE),
	  COALESCE(COMMISSION_PCT, 0)
FROM EMPLOYEES
WHERE EXTRACT(YEAR FROM HIRE_DATE) IN (2001, 2005);


-- 3. '515' 핸드폰 번호를 사용하지 않는 사람의 수를 출력하시오(뒤에 단위는 명을 붙이시오)
SELECT 
	  COUNT(*) || '명'
FROM EMPLOYEES
WHERE PHONE_NUMBER NOT LIKE '515%'


-- 4. 직원명과 입사년월을 2003년 6월 형태로 출력하시오
--	단, 아래와 같이 출력되도록 만들어 보시오
--	    EMP_NAME		HIRE_YY
--	ex) 리사		       1997년 3월
SELECT
    FIRST_NAME || ' '  || LAST_NAME,
    TO_CHAR(HIRE_DATE, 'YYYY"년 "MM"월"')
FROM EMPLOYEES;





--5 . 부서코드가 50,90인 직원들 중에서 2004년도에 입사한 직원 조회
-- 120(EMPNO)	Matthew Weiss(ENAME)	50(DEPTID)	2004-07-18(HIRE_DATE)  형식으로 출력 
SELECT
    EMPLOYEE_ID,
    FIRST_NAME || ' '  || LAST_NAME,
    DEPARTMENT_ID,
    TO_CHAR(HIRE_DATE, 'RRRR-MM-DD')
FROM EMPLOYEES
WHERE  DEPARTMENT_ID IN (50, 90)
AND EXTRACT(YEAR FROM HIRE_DATE) = 2004;



--6 . 직원명, 입사일, 오늘까지의 근무일수 조회 * 주말도 포함 , 소수점 아래는 버림
SELECT
    FIRST_NAME || ' '  || LAST_NAME,
    TO_CHAR(HIRE_DATE, 'RRRR-MM-DD'),
    FLOOR(SYSDATE - HIRE_DATE)
FROM EMPLOYEES;



	
-- 7. 직원들의 입사일로부터 년도만 가지고 각 년도별 입사 인원수를 구하시오
--  아래의 년도에 입사한 인원수를 조회하시오. 마지막으로 전체직원수도 구하시오

--  => to_char, decode, sum 사용
--
--	-------------------------------------------------------------------------
--	 2001년   2002년   2003년   2004년   2005년   2006년   2007년 2008년 전체직원수
--	-------------------------------------------------------------------------
SELECT
    SUM(DECODE(TO_CHAR(HIRE_DATE,'YYYY'), 2001, 1, 0)) AS "2001년",
    SUM(DECODE(TO_CHAR(HIRE_DATE,'YYYY'), 2002, 1, 0)) AS "2002년",
    SUM(DECODE(TO_CHAR(HIRE_DATE,'YYYY'), 2003, 1, 0)) AS "2003년",
    SUM(DECODE(TO_CHAR(HIRE_DATE,'YYYY'), 2004, 1, 0)) AS "2004년",
    SUM(DECODE(TO_CHAR(HIRE_DATE,'YYYY'), 2005, 1, 0)) AS "2005년",
    SUM(DECODE(TO_CHAR(HIRE_DATE,'YYYY'), 2006, 1, 0)) AS "2006년",
    SUM(DECODE(TO_CHAR(HIRE_DATE,'YYYY'), 2007, 1, 0)) AS "2007년",
    SUM(DECODE(TO_CHAR(HIRE_DATE,'YYYY'), 2008, 1, 0)) AS "2008년",
    COUNT(*) AS 전체직원수
FROM EMPLOYEES;


--8. 부서코드가 50이면 총무부, 60이면 기획부, 90이면 영업부로 처리하시오
--   단, 부서코드가 50, 60, 90 인 직원의 정보만 조회함
--  => case 사용
--   부서코드 기준 오름차순 정렬함.

SELECT
    FIRST_NAME || ' '  || LAST_NAME,
    DEPARTMENT_ID,
    CASE DEPARTMENT_ID
        WHEN 50 THEN '총무부'
        WHEN 60 THEN '기획부'
        WHEN 90 THEN '영업부'
    END AS 부서명
FROM EMPLOYEES
WHERE DEPARTMENT_ID IN (50, 60, 90)
ORDER BY DEPARTMENT_ID;

-------------------------------

JButton btnNewButton = new JButton("등록");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String title = t2.getText();
                String content = t3.getText();
                int writer = Integer.parseInt(t4.getText());

                BoardDto boardDto = new BoardDto(title, content, writer);
                BoardDao boardDao = new BoardDao();
                boardDao.insert(boardDto);
            }
    });
   
   
   
-------------------------------
public void insert(BoardDto boardDto) {
    Connection con = null;
    PreparedStatement ps = null;

    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String password = "tiger";
        con = DriverManager.getConnection(url, user, password);
        con.setAutoCommit(false);

        String sql = "insert into BBS values (BBS_ID_SEQ.nextval, ?, ?, ?)";
        ps = con.prepareStatement(sql);
        ps.setString(1,boardDto.getTitle());
        ps.setString(2,boardDto.getContent());
        ps.setInt(3,boardDto.getWriter());

        int result = ps.executeUpdate();

        if (result >= 1 ) {
            con.commit();
        }
        else {
            con.rollback();
        }

    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
        if (con != null) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    } finally {
        try {
            ps.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}