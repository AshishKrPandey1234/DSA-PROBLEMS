# Write your MySQL query statement below
SELECT MAX(salary) as secondHighestSalary
FROM Employee
WHERE salary < (SELECT max(salary)  FROM Employee)