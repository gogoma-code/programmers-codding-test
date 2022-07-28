// 3진법 뒤집기 :: https://gogoma.tistory.com/107
// https://school.programmers.co.kr/learn/courses/30/lessons/68935?language=java
class Solution {
	public int solution(int n) {		
		StringBuilder sb = new StringBuilder();
		while(n > 0) {
			sb.append( n%3 );			
			n /= 3;
		}
		
		return Integer.valueOf(sb.toString(), 3);
	}
}