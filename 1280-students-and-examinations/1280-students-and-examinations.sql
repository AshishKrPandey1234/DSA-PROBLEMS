# Write your MySQL query statement below
SELECT s.student_id,s.student_name,sub.subject_name,count(e.student_id)as attended_exams
FROM Students s
CROSS JOIN Subjects sub
LEFT JOIN Examinations E
ON e.student_id=s.student_id
AND sub.subject_name=e.subject_name
GROUP BY s.student_id,s.student_name,sub.subject_name
ORDER BY s.student_id,s.student_name,sub.subject_name;