# Write your MySQL query statement below
SELECT prod.product_name, sale.year, sale.price
FROM Sales as sale
LEFT JOIN Product as prod
ON prod.product_id=sale.product_id; 