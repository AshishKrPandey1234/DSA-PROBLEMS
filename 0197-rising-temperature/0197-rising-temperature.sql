# Write your MySQL query statement below
SELECT today.id
from Weather yesterday 
CROSS JOIN Weather today

where DATEDIFF (today.recordDate,yesterday.recordDate)=1
And today.temperature>yesterday.temperature;