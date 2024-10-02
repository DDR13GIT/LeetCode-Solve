Select customer_id, count(customer_id) as count_no_trans
From Visits as v Left join
Transactions as t on
v.visit_id = t.visit_id 
where transaction_id Is NULL
Group by customer_id