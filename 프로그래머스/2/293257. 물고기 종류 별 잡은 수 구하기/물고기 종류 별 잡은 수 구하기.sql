SELECT
    A.FISH_COUNT
    , B.FISH_NAME
FROM 
    ( 
    SELECT
        FISH_TYPE
        , COUNT(*) AS FISH_COUNT
    FROM
        FISH_INFO 
    GROUP BY
        FISH_TYPE
    ) A
LEFT OUTER JOIN
    FISH_NAME_INFO B
ON 
    A.FISH_TYPE = B.FISH_TYPE
ORDER BY
    FISH_COUNT DESC