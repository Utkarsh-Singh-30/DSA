1# Write your MySQL query statement below
2
3select * from Cinema
4where id%2!=0 and description not like 'boring'
5order by rating DESC;