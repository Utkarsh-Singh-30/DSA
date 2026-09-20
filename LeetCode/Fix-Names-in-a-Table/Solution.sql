1# Write your MySQL query statement below
2select user_id,
3concat(upper(substring(name,1,1)), lower(substring(name,2)))as name from Users
4order by user_id; 
5
6