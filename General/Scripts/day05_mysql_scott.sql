-- New script in localhost 2.
-- Connection Type: dev 
-- Url: jdbc:mysql://localhost:3306/
-- workspace : C:\Database
-- Date: 2024. 5. 7.
-- Time: 오전 9:23:44

-- CREATE USER 'scott'@'%' IDENTIFIED BY 'localhost';
GRANT ALL PRIVILEGES ON *.* TO 'scott'@'%'

create database scott;
USE scott;


DROP TABLE MEMBER;
CREATE TABLE MEMBER(
	ID INT AUTO_INCREMENT PRIMARY KEY,
	pw varchar(10),
	name varchar(10),
	tel varchar(10),
	create_date timestamp
);

INSERT INTO MEMBER
values(NULL, 1, '리사', '010', NOW());

COMMIT;

-- 

USE scott;

DROP TABLE MEMBER;
CREATE TABLE member(
	id INT AUTO_INCREMENT PRIMARY KEY,
	mno varchar(10),
	pw varchar(10),
	name varchar(10),
	tel varchar(10),
	create_date timestamp

);


INSERT INTO MEMBER
VALUES(NULL,'m01', '1', '리사', '010',NOW());


COMMIT;

SELECT * FROM MEMBER;

-- 
CREATE TABLE member(
	no INT AUTO_INCREMENT PRIMARY KEY,
	id varchar(10),
	pw varchar(10),
	name varchar(10),
	tel varchar(10),
	create_date timestamp

);
