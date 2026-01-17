1# Write your MySQL query statement below
2
3select v.customer_id , 
4count( v.visit_id) as count_no_trans 
5from Visits v
6left join Transactions t on
7v.visit_id=t.visit_id
8where t.transaction_id is null
9group by v.customer_id;
10
11