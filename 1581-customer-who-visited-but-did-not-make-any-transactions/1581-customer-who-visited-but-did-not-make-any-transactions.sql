# Write your MySQL query statement below
with valid as(
    select visit_id , customer_id from Visits
    where visit_id not in(
        select visit_id from transactions
    )
)

select customer_id  , count(customer_id) as count_no_trans from valid
group by customer_id;