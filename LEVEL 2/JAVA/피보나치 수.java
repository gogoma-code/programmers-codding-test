// 피보나치 수
// https://school.programmers.co.kr/learn/courses/30/lessons/12945
class Solution {
    public int solution(int n) {
        int count = 2, mod = 1234567;
        int f1 = 0, f2 = 1;

        while (n > count) {
            int temp = f2;
            f2 = ((f1 % mod) + (f2 % mod)) % mod;
            f1 = temp;
            count++;
        }

        return (f1 + f2) % mod;
    }
}