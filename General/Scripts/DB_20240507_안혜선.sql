-- New script in system-localhost 9.
-- Connection Type: dev 
-- Url: jdbc:oracle:thin:@//localhost:1521/XE
-- workspace : D:\multicampus-workspace\03_database
-- Date: 2024. 5. 14.
-- Time: 오후 1:08:37

-- 회원 가입용 테이블 생성
CREATE TABLE MEMBER_TEST (
    USER_NO INT,
    USER_ID VARCHAR(50) NOT NULL,
    USER_PWD VARCHAR(50) NOT NULL,
    PNO VARCHAR(20) NOT NULL,
    GENDER VARCHAR(20),
    PHONE VARCHAR(20),
    ADDRESS VARCHAR(100),
    STATUS VARCHAR(20) NOT NULL,
    CONSTRAINT USER_ID_UNIQUE UNIQUE (USER_ID),
    CONSTRAINT PRO_UNIQUE UNIQUE (PNO)
);

COMMENT ON COLUMN  MEMBER_TEST.USER_NO  IS '회원번호';
COMMENT ON COLUMN  MEMBER_TEST.USER_ID IS '회원아이디';
COMMENT ON COLUMN  MEMBER_TEST.USER_PWD  IS '회원비밀번호';
COMMENT ON COLUMN  MEMBER_TEST.PNO  IS '주민등록번호';
COMMENT ON COLUMN  MEMBER_TEST.GENDER  IS '성별';
COMMENT ON COLUMN  MEMBER_TEST.PHONE  IS '연락처';
COMMENT ON COLUMN  MEMBER_TEST.ADDRESS  IS '주소';
COMMENT ON COLUMN  MEMBER_TEST.STATUS  IS '탈퇴여부';

INSERT INTO MEMBER_TEST 
VALUES(1, 'user1', 'password1', '000000-1234567', '남', '010-1234-5678', '서울', 'N');
INSERT INTO MEMBER_TEST 
VALUES(2, 'user2', 'password2', '000001-1234567', '여', '010-1123-5678', '부산', 'N');
INSERT INTO MEMBER_TEST 
VALUES(3, 'user3', 'password3', '000002-1234567', '남', '010-1112-5678', '대구', 'N');

---------------------------
-- 1) 항목을 넣어서 테이블을 완성
CREATE TABLE movie (
    lid VARCHAR2(10) PRIMARY KEY,
    title VARCHAR2(100),
    content VARCHAR2(100),
    actor VARCHAR2(100)
);

-- 2) 데이터를 넣는다.
INSERT INTO movie VALUES ('m1', '블랙아담', '액션', '드웨인 존슨');
INSERT INTO movie VALUES ('m2', '리멤버', '드라마', '남주혁');
INSERT INTO movie VALUES ('m3', '자백', '스릴러', '소지섭');

-- 3) 영화의 모든 정보를 검색
SELECT * FROM movie;

-- 4) m1의 정보를 검색
SELECT * FROM movie WHERE lid = 'm1';

-- 5) m1의 content를 스릴러로 변경, 검색하여 확인
UPDATE movie SET content = '스릴러' WHERE lid = 'm1';
SELECT * FROM movie WHERE lid = 'm1';

-- 6) m1을 삭제, 검색하여 확인
DELETE FROM movie WHERE lid = 'm1';
SELECT * FROM movie WHERE lid = 'm1';

---------------------------

-- 1) 항목을 넣어서 테이블을 완성
CREATE TABLE place (
    lid VARCHAR2(10) PRIMARY KEY,
    name VARCHAR2(100),
    addr VARCHAR2(200),
    tel VARCHAR2(20)
);

-- 2) 데이터를 넣는다.
INSERT INTO place (lid, name, addr, tel) VALUES ('p1', 'cgv', '강남구 삼성동', '02-555');
INSERT INTO place (lid, name, addr, tel) VALUES ('p2', 'megabox', '강남구 역삼동', '02-666');
INSERT INTO place (lid, name, addr, tel) VALUES ('p3', 'lotte', '강남구 대치동', '02-777');

-- 3) 영화관의 모든 정보를 검색
SELECT * FROM place;

--  4) cgv의 정보를 검색
SELECT * FROM place WHERE lid = 'p1';

-- 5) lotte의 전화번호가 02-888로 변경, 검색하여 확인
UPDATE place SET tel = '02-888' WHERE lid = 'p3';
SELECT * FROM place WHERE lid = 'p3';

-- 6) p3를 삭제
DELETE FROM place WHERE lid = 'p3';
SELECT * FROM place WHERE lid = 'p3';

-- 8) movie, place의 모든 데이터 삭제(dml)
DELETE FROM movie;
DELETE FROM place;

-- 9) movie, place 테이블 삭제(ddl)
DROP TABLE movie;
DROP TABLE place;


