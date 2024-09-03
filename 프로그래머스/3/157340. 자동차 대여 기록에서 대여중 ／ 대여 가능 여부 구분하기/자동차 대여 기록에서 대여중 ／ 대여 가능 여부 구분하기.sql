# SELECT 
#     A.CAR_ID
#     , case
#         when date_format(a.end_date, '%Y-%m-%d') >= '2022-10-16' then '대여중'
#         else '대여 가능'
#     end as AVAILABILITY
# FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY A
# GROUP BY
#     A.CAR_ID
# ORDER BY
#     A.CAR_ID desc

SELECT
    A.CAR_ID,
    CASE
        WHEN MAX('2022-10-16' BETWEEN START_DATE AND END_DATE) = 1 THEN '대여중'
        ELSE '대여 가능'
    END AS AVAILABILITY
FROM
    CAR_RENTAL_COMPANY_RENTAL_HISTORY A
GROUP BY
    A.CAR_ID
ORDER BY
    A.CAR_ID DESC;