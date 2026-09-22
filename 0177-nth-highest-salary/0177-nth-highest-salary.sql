CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      select salary from (select distinct salary, DENSE_RANK() OVER (ORDER BY salary desc) AS rnk from Employee) AS ranked where rnk = N 

  );
END