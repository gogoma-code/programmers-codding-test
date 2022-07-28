// 자릿수 더하기 :: https://gogoma.tistory.com/38
// https://school.programmers.co.kr/learn/courses/30/lessons/12931?language=java
class Solution {
	public int solution(int n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}

		return sum;
	}
	
	public int solution2(int n) {
		String nStr = String.valueOf(n);
		return nStr.chars().sum() - (48 * nStr.length());
	}
}