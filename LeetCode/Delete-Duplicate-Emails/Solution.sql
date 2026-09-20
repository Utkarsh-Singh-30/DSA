1# Write your MySQL query statement below
2
3delete p1 
4from Person p1 , Person p2 
5where p1.email=p2.email
6and p1.id>p2.id;
7