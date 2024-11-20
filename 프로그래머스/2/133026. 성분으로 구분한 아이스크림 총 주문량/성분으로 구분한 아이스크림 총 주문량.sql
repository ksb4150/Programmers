SELECT
    B1.INGREDIENT_TYPE, SUM(TOTAL_ORDER) AS TOTAL_ORDER
FROM
    FIRST_HALF A1
LEFT OUTER JOIN
    ICECREAM_INFO B1
ON
    A1.FLAVOR = B1.FLAVOR
GROUP BY
    B1.INGREDIENT_TYPE
ORDER BY
    TOTAL_ORDER ASC