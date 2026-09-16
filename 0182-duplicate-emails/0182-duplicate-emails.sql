# Write your MySQL query statement below
select email AS Email from Person Group By email HAVING count(*)>1;
