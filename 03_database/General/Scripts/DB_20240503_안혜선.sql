-- New script in localhost 6.
-- Connection Type: dev 
-- Url: jdbc:oracle:thin:@//localhost:1521/XE
-- workspace : C:\Database
-- Date: 2024. 5. 3.
-- Time: 오후 5:03:11


--computer 계정 생성, 권한 설정
create user computer identified by 1234;
grant connect, resource, dba TO computer;

--computer로 연결 후 mouse 계정 생성, 권한 설정
create user mouse identified by 1111;
grant connect TO mouse;
--keyboard 생성
create user keyboard identified BY 1234;

--관리자 계정 재연결 후 권한 해제
REVOKE resource FROM computer;
--테이블 생성
CREATE TABLE student(
	NAME Varchar2(100),
	SUBJECT Varchar2(100)
);
--테이블 삭제
DROP USER computer;
DROP USER mouse;