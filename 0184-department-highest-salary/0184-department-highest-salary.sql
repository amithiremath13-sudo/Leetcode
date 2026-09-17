# Write your MySQL query statement below
select d.name AS Department,e.name AS Employee,e.salary AS Salary from Employee e join Department d on e.departmentId = d.id join (select departmentId, max(salary) AS maxSalary from Employee Group By departmentId) m on e.departmentId = m.departmentId where e.salary = maxSalary;
