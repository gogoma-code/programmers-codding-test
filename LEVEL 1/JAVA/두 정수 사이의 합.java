// 두 정수 사이의 합 :: https://gogoma.tistory.com/78
// https://school.programmers.co.kr/learn/courses/30/lessons/12912?language=java
class Solution {
	public long solution(int a, int b) {
		if (a != b) {
			int start = a < b ? a : b;
			int end = a < b ? b : a;
			long sum = 0;
			for (int i = start; i <= end; i++)
				sum += i;

			return sum;

		} else
			return a;
	}
	
	public long solution2(int a, int b) {
		long sum = 0;
		for(int i=Math.min(a, b); i<=Math.max(a, b); i++) {
			sum += i;
		}
		return sum;
	}
	
	public long solution3(int a, int b) {
		return sequenceSum(Math.min(a, b), Math.max(a, b));
	}
	
	public long sequenceSum(long min, long max) {
		return (max - min + 1) * (min + max) / 2;
	}
}