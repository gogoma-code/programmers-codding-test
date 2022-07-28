// 정수 제곱근 판별 :: https://gogoma.tistory.com/50
// https://school.programmers.co.kr/learn/courses/30/lessons/12934?language=java
class Solution {
	public long solution(long n) {
		if (Math.pow((int) Math.sqrt(n), 2) == n)
			return (long) Math.pow(Math.sqrt(n) + 1, 2);
		return -1;
	}
	
	public long solution2(long n) {
		long count = 30;
		double x = 1.0;
		while(0 < count--) {
			x = (x + (n / x)) / 2;
		}
		
		return (x % 1 == 0.0) ? (long) ((x+1) * (x+1)) : -1;
	}
}