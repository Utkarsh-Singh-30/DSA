1# Write your MySQL query statement below
2
3select EmployeeUNI.unique_id, Employees.name
4from Employees
5left join EmployeeUNI on 
6EmployeeUNI.id=Employees.id;
7
8