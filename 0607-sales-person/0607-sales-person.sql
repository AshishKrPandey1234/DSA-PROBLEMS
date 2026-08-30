# Write your MySQL query statement below
SELECT name FROM SalesPerson WHERE sales_id not in(
    SELECT sales_id FROM  orders WHERE com_id IN
    (select com_id from company where name='Red')
)