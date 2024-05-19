-- New script in localhost 6.
-- Connection Type: dev 
-- Url: jdbc:oracle:thin:@//localhost:1521/XE
-- workspace : D:\multicampus-workspace\03_database
-- Date: 2024. 5. 13.
-- Time: 오전 9:39:53

SELECT 
	FIRST_NAME || ' ' || LAST_NAME AS 사원명,
	EMPLOYEE_ID AS 사원번호,
	B.DEPARTMENT_NAME AS 부서명,
	C.JOB_TITLE AS 직급명
FROM EMPLOYEES A 
LEFT JOIN DEPARTMENTS B ON A.DEPARTMENT_ID = B.DEPARTMENT_ID 
LEFT JOIN JOBS C ON A.JOB_ID = C.JOB_ID 
WHERE LAST_NAME = 'Cambrault';