// 약수의 합 : https://gogoma.tistory.com/39
// https://school.programmers.co.kr/learn/courses/30/lessons/12928?language=java
import java.util.HashSet;

class Solution {
	public int solution(int n) {
		int sum = n;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) sum += i;
		}

		return sum;
	}

	public int solution2(int n) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=1; i<=Math.sqrt(n); i++) {
			if(n % i == 0) {
				set.add(i);
				set.add(n / i);
			}
		}
		
		return set.stream().mapToInt(Integer::intValue).sum();
	}
}