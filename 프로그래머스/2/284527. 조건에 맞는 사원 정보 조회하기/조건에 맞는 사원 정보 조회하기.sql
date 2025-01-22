
SELECT 
    B.SCORE, A.EMP_NO, A.EMP_NAME, A.POSITION, A.EMAIL
FROM    
    HR_EMPLOYEES A
INNER JOIN
    (
        SELECT 
            A.EMP_NO
            , SUM(A.SCORE) AS SCORE
        FROM 
            HR_GRADE A
        GROUP BY
            A.EMP_NO
        ORDER BY 
            SUM(A.SCORE) DESC
        LIMIT 1
    ) B
ON 
    A.EMP_NO = B.EMP_NO
