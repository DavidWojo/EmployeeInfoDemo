-- *************************************************************
-- This script creates the sample database (employee_db)
-- *************************************************************

-- ********************************************
-- CREATE THE AP DATABASE
-- *******************************************

-- create the database
DROP DATABASE IF EXISTS employee_db;
CREATE DATABASE employee_db;

-- select the database
USE employee_db;

-- create the table
CREATE TABLE employee
(
  EmployeeID   INT            PRIMARY KEY   AUTO_INCREMENT,    
  FirstName    VARCHAR(50)    NOT NULL,   
  LastName     VARCHAR(50),
  Email        VARCHAR(50)   
  );

-- insert rows into the table
INSERT INTO employee VALUES 
(100,'David',  'Wojciechowski', 'davidwojo15@gmail.com'), 
(101,'Sylvia', 'Kedzierski', 'tanzmusic@yahoo.com'), 
(102,'Alice',  'Kedzierski', 'alice_kedzierski@gmail.com'),
(103,'Sierra',  '', 'sierra@cats.com'),
(104,'Cougar',  '', 'cougar@cats.com');



