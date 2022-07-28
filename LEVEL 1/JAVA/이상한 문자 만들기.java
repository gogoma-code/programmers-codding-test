// 이상한 문자 만들기 :: https://gogoma.tistory.com/59
// https://school.programmers.co.kr/learn/courses/30/lessons/12930?language=java
class Solution {	
	public String solution(String s) {
		StringBuilder sb = new StringBuilder();
		boolean evenFlag = true;
		for (char ch : s.toCharArray()) {
			sb.append(evenFlag ? Character.toUpperCase(ch) : Character.toLowerCase(ch));
			evenFlag = (ch == ' ') ? true : !evenFlag;
		}
		
		return sb.toString();
	}
}