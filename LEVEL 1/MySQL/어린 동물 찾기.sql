/*
어린 동물 찾기
https://school.programmers.co.kr/learn/courses/30/lessons/59037?language=mysql
*/
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS 
WHERE INTAKE_CONDITION != 'Aged' /*젊은 동물 찾기*/
ORDER BY ANIMAL_ID ASC /*아이디 순으로 조회*/