1# Write your MySQL query statement below
2
3select s.student_id, s.student_name,
4sub.subject_name,
5count(e.subject_name) as attended_exams 
6from Students s
7cross join Subjects sub
8left join Examinations e
9on s.student_id= e.student_id
10and sub.subject_name=e.subject_name
11group by s.student_id, s.student_name, sub.subject_name
12order by s.student_id, sub.subject_name;
13