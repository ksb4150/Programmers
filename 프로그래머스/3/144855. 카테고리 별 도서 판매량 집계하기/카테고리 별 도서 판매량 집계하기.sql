SELECT
    A.CATEGORY, SUM(B.SALES) AS TOTAL_SALES
FROM BOOK A
RIGHT OUTER JOIN
( 
    SELECT BS.BOOK_ID, BS.SALES
    FROM BOOK_SALES BS
    WHERE DATE_FORMAT(SALES_DATE, "%Y-%m") = "2022-01"
) B
ON A.BOOK_ID = B.BOOK_ID
GROUP BY A.CATEGORY
ORDER BY A.CATEGORY ASC