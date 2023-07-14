// 숫자의 표현
// https://school.programmers.co.kr/learn/courses/30/lessons/12924
class Solution {
    public int solution(int n) {
        int count = 0, sum = 0;
        for (int i = 1; i < n / 2 + 1; i++) {
            sum = 0;
            int tmp = i;
            while (sum < n) {
                sum += tmp++;
                if (sum == n)
                    count++;
            }
        }

        return count + 1;
    }
}