// 부족한 금액 계산하기 :: https://gogoma.tistory.com/90
// https://school.programmers.co.kr/learn/courses/30/lessons/82612?language=java
class Solution {
    public long solution(int price, int money, int count) {
        long reamin =  ((long) price * count * (count+1) / 2) - money;
        return reamin >= 0 ? reamin : 0;
    }

    public long solution2(int price, int money, int count) {
        return Math.max(((long) price * count * (count+1) / 2) - money, 0 );
    }
}