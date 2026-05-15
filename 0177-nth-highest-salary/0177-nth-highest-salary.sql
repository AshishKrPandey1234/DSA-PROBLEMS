CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      WITH CTE_NAME AS(SELECT salary, DENSE_RANK()  
                    OVER (ORDER BY salary DESC) AS dr
                    FROM Employee
                )
      select DISTINCT salary from CTE_NAME where dr=N
  );
END