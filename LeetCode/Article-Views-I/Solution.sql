1# Write your MySQL query statement below
2
3select distinct author_id AS id from Views 
4where author_id=viewer_id
5order by id ASC;