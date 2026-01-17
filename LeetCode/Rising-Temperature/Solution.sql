1# Write your MySQL query statement below
2
3select w1.id
4from Weather w1
5join Weather w2 on 
6datediff(w1.recordDate,w2.recordDate)=1
7where w1.temperature>w2.temperature;
8
9
10
11