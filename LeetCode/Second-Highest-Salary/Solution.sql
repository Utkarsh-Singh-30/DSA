1# Write your MySQL query statement below
2
3select max(salary) as SecondHighestSalary  from Employee
4where salary not in (select max(salary) from Employee);