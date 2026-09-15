# Write your MySQL query statement below
# here the concept used is self join we have to create 3 copis of the table to compare 3 rows at a time
select DISTINCT a.num AS ConsecutiveNums from Logs a join Logs b join Logs c where 
b.id = a.id+1 AND c.id = b.id+1 AND a.num = b.num AND b.num = c.num;  
