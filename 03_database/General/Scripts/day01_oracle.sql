-- New script in localhost.
-- Connection Type: dev 
-- Url: jdbc:oracle:thin:@//localhost:1521/XE
-- workspace : C:\Database
-- Date: 2024. 5. 3.
-- Time: 오전 11:34:49


-- 오라클 계정생성 system 으로 연결후 생성하고 권한주기 
create user scott identified by tiger;

grant connect, resource, dba TO scott;

SELECT * FROM HR.EMPLOYEES;

-- 계정 수정
ALTER USER hr IDENTIFIED BY hr;

-- 계정 락 풀기 
ALTER USER hr account unlock;

------------------------------
--computer 계정으로 가서 실행 -- 과제할 때




















----------------------------
--apple 계정 생성
create user apple identified by 1234;

--접속 권한 주기
GRANT CONNECT TO apple


drop USER apple CASCADE;

