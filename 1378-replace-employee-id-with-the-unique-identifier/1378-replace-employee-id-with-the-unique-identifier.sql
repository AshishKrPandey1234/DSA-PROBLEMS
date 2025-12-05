# Write your MySQL query statement below
-- select  u.unique_id, e.name from Employees as e left join  EmployeeUNI as u on e.id = u.id;

select unique_id, name from (
    select  u.unique_id as unique_id, e.name as name from Employees as e left join  EmployeeUNI as u on e.id = u.id) as t