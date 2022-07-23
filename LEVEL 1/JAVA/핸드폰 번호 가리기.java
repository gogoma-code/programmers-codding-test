// 핸드폰 번호 가리기 :: https://gogoma.tistory.com/31
// https://school.programmers.co.kr/learn/courses/30/lessons/12948?language=java
public class Solution {
    // 풀이-1
	public String solution(String phone_number) {
		StringBuilder sb = new StringBuilder(phone_number);
		for (int i = 0; i < phone_number.length()-4; i++) {
			sb.setCharAt(i, '*');
		}

		return sb.toString();
	}
	
	// 풀이-2
	public String solution3(String phone_number) {
		return phone_number.replaceAll(".(?=.{4})", "*");
	}
}
