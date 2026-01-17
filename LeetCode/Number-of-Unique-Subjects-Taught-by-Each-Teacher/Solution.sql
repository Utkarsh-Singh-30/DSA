1# Write your MySQL query statement below
2
3
4select teacher_id ,
5count( distinct subject_id) as cnt
6from Teacher
7group by teacher_id;