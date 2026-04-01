1# Write your MySQL query statement below
2
3SELECT 
4    activity_date AS day, 
5    COUNT(DISTINCT user_id) AS active_users
6FROM Activity
7WHERE activity_date > '2019-06-27' AND activity_date <= '2019-07-27'
8GROUP BY activity_date;