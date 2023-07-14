// 예상 대진표
// https://school.programmers.co.kr/learn/courses/30/lessons/12985?language=java
class Solution {
    public int solution(int n, int a, int b) {
        return Integer.toBinaryString((a-1)^(b-1)).length();
    }
}