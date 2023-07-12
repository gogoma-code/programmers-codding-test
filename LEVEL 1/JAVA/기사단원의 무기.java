// 기사단원의 무기
// https://school.programmers.co.kr/learn/courses/30/lessons/136798
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 1;

        for (int n = 2; n <= number; n++) {
            int divisor = 0;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    divisor += 2;
            }
            if (n % Math.sqrt(n) == 0)
                divisor--;

            answer += limit < divisor ? power : divisor;
        }

        return answer;
    }
}