# Write your MySQL query statement beloS
Select customer_id , Count(visit_id) as count_no_trans 
From Visits 
where visit_id not in (select visit_id from Transactions)
group by customer_id