1# Write your MySQL query statement below
2
3SELECT e.name, eu.unique_id
4FROM Employees e
5LEFT JOIN EmployeeUNI eu ON e.id = eu.id
6
7