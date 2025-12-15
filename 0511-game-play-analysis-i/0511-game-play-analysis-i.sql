# Write your MySQL query statement below
SELECT player_id, MIN(event_date) AS first_login
FROM Activity Group BY(player_id);