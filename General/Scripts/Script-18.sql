-- New script in student-localhost 5.
-- Connection Type: dev 
-- Url: jdbc:oracle:thin:@//localhost:1521/XE
-- workspace : D:\multicampus-workspace\03_database
-- Date: 2024. 5. 13.
-- Time: 오후 4:26:57

CREATE TABLE PCMEMBER
(	id VARCHAR2(100) NOT NULL,
	pw VARCHAR2(10) NOT NULL,
	name VARCHAR2(100) NOT NULL,
	num VARCHAR2(100) NOT NULL,
	time INT
);



Drop TABLE PCMEMBER;
SELECT * FROM PCMEMBER ;