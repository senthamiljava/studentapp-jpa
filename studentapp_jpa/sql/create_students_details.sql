CREATE DATABASE student_details_db;

USE student_details_db;

DROP TABLE students;

CREATE TABLE students(id INT PRIMARY KEY AUTO_INCREMENT,NAME VARCHAR(30) NOT NULL,
email_id VARCHAR(30) NOT NULL,college_name VARCHAR(50) NOT NULL);

DROP TABLE skills;

CREATE TABLE skills(id INT PRIMARY KEY AUTO_INCREMENT,NAME VARCHAR(30) NOT NULL);

DROP TABLE student_skills;

CREATE TABLE student_skills(id INT PRIMARY KEY AUTO_INCREMENT,student_id INT,skill_id INT,
scale VARCHAR(20) CHECK(scale IN('YET TO LEARN','BEGINER','INTERMEDIATE','EXPERT')),
CONSTRAINT fk_student_id FOREIGN KEY(student_id) REFERENCES students(id),
CONSTRAINT fk_skill_id FOREIGN KEY(skill_id) REFERENCES skills(id))


INSERT INTO skills(NAME) VALUES('sql');
INSERT INTO skills(NAME) VALUES('core java');
INSERT INTO skills(NAME) VALUES('spring');
INSERT INTO skills(NAME) VALUES('hibernate');
INSERT INTO skills(NAME) VALUES('angularjs');

INSERT INTO students(NAME,email_id,college_name) VALUES('Arumugapriya','priyasankaran95@gmail.com','REC');
INSERT INTO students(NAME,email_id,college_name) VALUES('Akshaya','ashpeekay23@gmail.com','Jeppiar');
INSERT INTO students(NAME,email_id,college_name) VALUES('Nantha kumar','nanda220896@gmail.com','REC');
INSERT INTO students(NAME,email_id,college_name) VALUES('Gowtham','gautamgow@gmail.com','REC');

INSERT INTO students(NAME,email_id,college_name) VALUES('Pavan','pavanshrivatsav96@gmail.com','VELS University');
INSERT INTO students(NAME,email_id,college_name) VALUES('Ragavan','ragav87@ymail.com','Jeppiar');
INSERT INTO students(NAME,email_id,college_name) VALUES('Sridhar','vikkysri77@gmail.com','BS Abdul Rehman');
INSERT INTO students(NAME,email_id,college_name) VALUES('Gowthamvel','gvel6989@gmail.com','KCT(CBE)');
INSERT INTO students(NAME,email_id,college_name) VALUES('Mahesh kumar','mahesh11317@gmail.com','SNS CT(CBE)');



INSERT INTO student_skills(student_id,skill_id,scale) VALUES(, ,'');

SELECT * FROM students;

SELECT * FROM skills;

SELECT * FROM student_skills;