SELECT food_type,
        MAX(REST_ID) KEEP(DENSE_RANK FIRST ORDER BY FAVORITES DESC) AS REST_ID,
        MAX(REST_NAME) KEEP(DENSE_RANK FIRST ORDER BY FAVORITES DESC) AS REST_NAME,
        MAX(FAVORITES) KEEP(DENSE_RANK FIRST ORDER BY FAVORITES DESC) AS FAVORITES
FROM REST_INFO
GROUP BY FOOD_TYPE
ORDER BY FOOD_TYPE DESC