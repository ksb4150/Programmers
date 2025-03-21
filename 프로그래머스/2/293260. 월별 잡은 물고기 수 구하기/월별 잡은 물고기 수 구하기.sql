SELECT
    COUNT(*) AS FISH_COUNT, 
    CAST(SUBSTRING(TIME, 6, 2) AS DECIMAL) AS MONTH
FROM
    FISH_INFO
GROUP BY
    CAST(SUBSTRING(TIME, 6, 2) AS DECIMAL)
ORDER BY
    MONTH ASC