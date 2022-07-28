/*
아픈 동물 찾기
https://school.programmers.co.kr/learn/courses/30/lessons/59036?language=mysql
*/
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS 
WHERE INTAKE_CONDITION = 'Sick' /* 아픈 동물만 조회 */
ORDER BY ANIMAL_ID ASC /* 결과는 아이디 순으로 조회 */