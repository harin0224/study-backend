-- New script in localhost 6.
-- Connection Type: dev 
-- Url: jdbc:oracle:thin:@//localhost:1521/XE
-- workspace : D:\multicampus-workspace\03_database
-- Date: 2024. 5. 10.
-- Time: 오후 3:13:20
CREATE USER student IDENTIFIED BY student;
GRANT connect,resource TO student;