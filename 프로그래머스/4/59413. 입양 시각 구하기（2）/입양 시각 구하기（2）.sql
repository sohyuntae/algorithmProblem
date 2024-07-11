WITH RECURSIVE cte (i) AS
(
  SELECT 0
  UNION ALL
  SELECT i + 1 FROM cte WHERE i < 23
)
SELECT
    c.i AS HOUR,
    COUNT(ANIMAL_ID)
FROM cte c
LEFT JOIN ANIMAL_OUTS ao ON c.i = HOUR(DATETIME)
GROUP BY c.i
ORDER BY c.i ASC