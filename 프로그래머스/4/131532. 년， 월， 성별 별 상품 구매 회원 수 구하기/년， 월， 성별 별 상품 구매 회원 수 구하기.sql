-- 코드를 입력하세요
SELECT
    YEAR(OS.SALES_DATE) AS YEAR,
    MONTH(OS.SALES_DATE) AS MONTH,
    UI.GENDER AS GENDER,
    COUNT(DISTINCT UI.USER_ID) AS USERS
FROM ONLINE_SALE OS
LEFT JOIN USER_INFO UI ON OS.USER_ID = UI.USER_ID
WHERE UI.GENDER IS NOT NULL
GROUP BY YEAR(OS.SALES_DATE), MONTH(OS.SALES_DATE), UI.GENDER
ORDER BY YEAR(OS.SALES_DATE), MONTH(OS.SALES_DATE), UI.GENDER ASC