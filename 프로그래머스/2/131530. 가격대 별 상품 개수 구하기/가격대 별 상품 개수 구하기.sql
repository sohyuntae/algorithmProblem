WITH RECURSIVE CTE AS
(
    SELECT n
    from (
    SELECT 
        (PRICE div 10000) * 10000 as n
    FROM PRODUCT
    ) A
    ORDER BY n ASC
)
select
    n as PRICE_GROUP,
    count(n) as PRODUCTS
from CTE
GROUP BY n
ORDER BY n asc