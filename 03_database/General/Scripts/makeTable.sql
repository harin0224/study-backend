-- New script in localhost.
-- Connection Type: dev 
-- Url: jdbc:oracle:thin:@//localhost:1521/XE
-- workspace : C:\Database
-- Date: 2024. 5. 3.
-- Time: 오후 4:17:22


--테이블 만들기 
--[표현식] :
--CREATE TABLE 테이블명(컬럼명 자료형(크기) , 컬럼명 자료형(크기)....);
CREATE TABLE member(
	ID Varchar2(100),
	PW Varchar2(100),
	NAME Varchar2(100),
	TEL Varchar2(100)
);



-- 컬럼에 주석달기 
--[표현식]
-- COMMENT ON COLUMN 테이블명.컬럼명 IS '주석내용'
COMMENT ON COLUMN MEMBER.ID IS '회원아이디';
COMMENT ON COLUMN MEMBER.PW IS '비밀번호';
COMMENT ON COLUMN MEMBER.NAME IS '회원이름';


SELECT * 
FROM SYS.USER_TABLES;

INSERT INTO MEMBER VALUES ('100','1234','PARK','011');

INSERT INTO MEMBER VALUES ('200','1234','PARK','011');

INSERT INTO MEMBER VALUES ('300','1111','APPLE','011');



SELECT * FROM "MEMBER" ORDER BY ID ;

