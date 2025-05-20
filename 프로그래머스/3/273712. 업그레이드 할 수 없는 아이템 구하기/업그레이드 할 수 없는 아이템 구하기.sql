SELECT
    AB.ITEM_ID, C.ITEM_NAME, C.RARITY
FROM
    (
        SELECT
            A.ITEM_ID, B.PARENT_ITEM_ID
        FROM
            ITEM_TREE A
        LEFT OUTER JOIN
            ITEM_TREE B
        ON
            A.ITEM_ID = B.PARENT_ITEM_ID
        WHERE 
            B.PARENT_ITEM_ID IS NULL
    ) AB
INNER JOIN
    ITEM_INFO C
ON 
    AB.ITEM_ID = C.ITEM_ID
ORDER BY
    AB.ITEM_ID DESC