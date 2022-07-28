// 소수 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/12921?language=java
class Solution {
	public int solution(int n) {
		int[] prime = new int[n + 1];
		int i, j, cnt = 0;

		for (i = 0; i <= n; i++)
			prime[i] = 0;
		prime[1] = 1;

		for (i = 2; i <= n; i++) {
			for (j = 2; i * j <= n; j++)
				prime[i * j] = 1;
		}

		for (i = 1; i <= n; i++)
			if (prime[i] != 1)
				cnt++;

		return cnt;
	}
}