// 다음 큰 숫자
// https://school.programmers.co.kr/learn/courses/30/lessons/12911
class Solution {
    public int solution(int n) {
        int bitCount = Integer.bitCount(n);
        int target = n;
        while (bitCount != Integer.bitCount(++target)) {
        }

        return target;
    }
}