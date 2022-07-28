// 시저 암호 :: https://gogoma.tistory.com/94
// https://school.programmers.co.kr/learn/courses/30/lessons/12926?language=java
class Solution {
	public String solution(String s, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') { // 소문자
				int gap = ch + n - 'z';
				ch = gap > 0 ? (char) ('a' + gap - 1) : (char) (ch + n);
			} else if (ch >= 'A' && ch <= 'Z') { // 대문자
				int gap = ch + n - 'Z';
				ch = gap > 0 ? (char) ('A' + gap - 1) : (char) (ch + n);
			}
			sb.append(ch);
		}
		return sb.toString();
	}
	
	public String solution2(String s, int n) {
		StringBuilder sb = new StringBuilder();
		for(char ch : s.toCharArray()) {
			if(ch != ' ') {
				char a = Character.isLowerCase(ch) ? 'a' : 'A';
				ch = (char) ((ch - a + n) % 26 + a);
			}
			sb.append(ch);
		}
		
		return sb.toString();
	}
}