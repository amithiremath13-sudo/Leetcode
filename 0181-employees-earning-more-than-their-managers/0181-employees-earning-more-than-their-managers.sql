# Write your MySQL query statement below
#This problem uses self join
select e.name AS Employee from Employee e join Employee m on e.managerId = m.id where e.salary>m.salary; 
