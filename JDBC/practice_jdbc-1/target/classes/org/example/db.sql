CREATE DATABASE testing;
USE testing;
CREATE TABLE Subject(
                        id INT PRIMARY KEY AUTO_INCREMENT,
                        name VARCHAR(40)
);
CREATE TABLE Student(
                        id INT PRIMARY KEY AUTO_INCREMENT,
                        student_name VARCHAR(30),
                        score FLOAT,
                        subject_id INT,
                        FOREIGN KEY (subject_id) REFERENCES Subject(id)
);