# Write your MySQL query statement below
select class from Courses Group BY class HAVING count(*)>4;
