SELECT
    C.FLAVOR
FROM (
    SELECT
        A.FLAVOR, SUM(A.TOTAL_ORDER + B.TOTAL_ORDER) AS TOTAL_ORDER
    FROM 
        FIRST_HALF A
    INNER JOIN JULY B
    ON A.FLAVOR = B.FLAVOR
    GROUP BY A.FLAVOR
    ORDER BY SUM(A.TOTAL_ORDER + B.TOTAL_ORDER) DESC
) C
WHERE ROWNUM <= 3