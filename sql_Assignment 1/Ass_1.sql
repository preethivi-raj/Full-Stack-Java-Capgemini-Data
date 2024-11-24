create database if not exists CompanyDB;
use CompanyDB;
#create department table
create table Departments(
departmentID int auto_increment primary key ,
departmentName varchar(50) not null unique ,
location varchar(100) not null
);

# create Employees Table
create table Employees(
employeeID int auto_increment primary key ,
firstName varchar(50) not null ,
lastName varchar(50) not null ,
departmentID int not null ,
dateOfBirth date not null ,
email varchar(100) not null unique,
gender enum("Male","Female" ,"Other") not null ,
hireDate date not null check(hireDate >= "2000-01-01"),
foreign key (departmentID) references Departments(DepartmentID)
);


# create Project Table
create table Projects(
projectID int auto_increment primary key ,
projectName varchar(100) not null unique ,
startDate date not null,
endDate date not null ,
check (endDate > startDate),
budget decimal(15,2) not null check(budget > 0)
);



CREATE TABLE Assignments ( 
assignmentID INT AUTO_INCREMENT PRIMARY KEY, 
employeeID INT NOT NULL,
 projectID INT NOT NULL, 
 hoursWorked DECIMAL(5, 2)
 NOT NULL CHECK (hoursWorked >= 0),
 FOREIGN KEY (employeeID) REFERENCES Employees(employeeID),
 FOREIGN KEY (projectID) REFERENCES Projects(projectID) );
 

 
 CREATE TABLE Salaries ( 
 salaryID INT AUTO_INCREMENT PRIMARY KEY, 
 employeeID INT NOT NULL, 
 baseSalary DECIMAL(10, 2) NOT NULL CHECK (baseSalary > 0), 
 bonus DECIMAL(10, 2) CHECK (bonus >= 0), 
 FOREIGN KEY (employeeID) REFERENCES Employees(employeeID) 
 );

 
 INSERT INTO Departments (departmentName, location) VALUES
 ('HR', 'New York'),
 ('IT', 'San Francisco'),
 ('Finance', 'Chicago'), 
 ('Marketing', 'Los Angeles');
 
  INSERT INTO Employees (firstName, lastName, departmentID, dateOfBirth, email, gender, hireDate) VALUES 
  ('John', 'Doe', 1, '1985-04-12', 'john.doe@example.com', 'Male', '2010-05-10'),
  ('Jane', 'Smith', 2, '1990-08-23', 'jane.smith@example.com', 'Female', '2015-07-19'),
  ('Alice', 'Brown', 3, '1982-11-17', 'alice.brown@example.com', 'Female', '2008-02-25'),
  ('Bob', 'Johnson', 4, '1979-03-30', 'bob.johnson@example.com', 'Male', '2005-01-15');
  
  INSERT INTO Projects (projectName, startDate, endDate, budget) VALUES 
  ('Website Redesign', '2023-01-01', '2023-12-31', 100000), 
  ('Mobile App Development', '2023-03-01', '2024-02-28', 150000),
  ('Data Migration', '2022-06-01', '2023-06-30', 50000);
  
  INSERT INTO Assignments (employeeID, projectID, hoursWorked) VALUES
  (1, 1, 120),
  (2, 2, 250),
  (3, 3, 180),
  (4, 1, 90);
  
  INSERT INTO Salaries (employeeID, baseSalary, bonus) VALUES
  (1, 60000, 5000), 
  (2, 80000, 7000),
  (3, 75000, 6000),
  (4, 90000, 10000);
  
  # Problems Answer 
  # 1
  select * from Employees as e  join Departments as d where e.departmentID = d.departmentID and (d.departmentName = "IT");
  
  # 2
  select * from employees where hireDate > "2010-01-01";
  
  #3
  select * from Projects where budget  > 80000;
  
  #4 
  select * from Employees order by hireDate desc;
  
  #5
  select * from Projects order by budget desc;
  
  #6
  SELECT d.DepartmentName, COUNT(e.EmployeeID) AS EmployeeCount
	FROM Departments d
	LEFT JOIN Employees e ON d.DepartmentID = e.DepartmentID
	GROUP BY d.DepartmentName;
    
  #7
  select * from salaries order by baseSalary desc limit 3;
  
  #8
  select e.firstName , e.lastName , d.departmentName from employees as e join departments as d 
  where e.departmentID = d.departmentID;
  
  #9
  select * from assignments as a join employees as e join projects as p 
  where a.employeeID = e.employeeID and a.projectID = p.projectID;
  
  #10
 SELECT e.firstName ,e.lastName ,p.projectName ,p.budget FROM Employees e
 JOIN Assignments a ON e.employeeID = a.employeeID
 JOIN Projects p ON a.projectID = p.projectID
 WHERE p.budget = (SELECT MAX(budget) FROM Projects);
 
 #11
 select e.firstName , timestampdiff(year , e.dateOfBirth , curdate()) as age from employees as e;
 
 #12
 select e.firstName , e.lastName , (s.baseSalary + ifnull(s.bonus,0)) as total_salary 
 from salaries as s join employees as e where s.employeeID = e.employeeId;
 
 #13
 SELECT FirstName, LastName, HireDate
 FROM Employees
 WHERE YEAR(HireDate) = 2015;
 
 #14
 SELECT ProjectName
FROM Projects
WHERE EndDate < '2023-12-01';

#15
SELECT e.FirstName, e.LastName, s.BaseSalary
FROM Employees e
JOIN Salaries s ON e.EmployeeID = s.EmployeeID
WHERE s.BaseSalary > 70000;

#16
SELECT e.FirstName, e.LastName, COUNT(a.ProjectID) AS ProjectsHandled
FROM Employees e
JOIN Assignments a ON e.EmployeeID = a.EmployeeID
GROUP BY e.EmployeeID;

#17
SELECT DepartmentName, Location
FROM Departments
WHERE Location = 'San Francisco';

#18
SELECT p.ProjectName, SUM(a.HoursWorked) AS TotalHoursWorked
FROM Projects p
JOIN Assignments a ON p.ProjectID = a.ProjectID
GROUP BY p.ProjectID;

#19
SELECT MAX(Bonus) AS HighestBonus
FROM Salaries;

#20
SELECT ProjectName, DATEDIFF(EndDate, StartDate) AS DurationInDays
FROM Projects
WHERE DATEDIFF(EndDate, StartDate) > 365;

#21
SELECT ProjectName, StartDate
FROM Projects
WHERE YEAR(StartDate) = 2023;

#22
SELECT e.FirstName, e.LastName, SUM(a.HoursWorked) AS TotalHoursWorked
FROM Employees e
JOIN Assignments a ON e.EmployeeID = a.EmployeeID
GROUP BY e.EmployeeID;

#23
SELECT d.DepartmentName, COUNT(e.EmployeeID) AS EmployeeCount
FROM Departments d
JOIN Employees e ON d.DepartmentID = e.DepartmentID
GROUP BY d.DepartmentName
ORDER BY EmployeeCount DESC
LIMIT 1;

#24
SELECT FirstName, LastName, DateOfBirth
FROM Employees
WHERE DateOfBirth < '1985-01-01';


