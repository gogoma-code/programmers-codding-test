// JadenCase 문자열 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12951
class Solution {
    public String solution(String s) {
		StringBuilder sb = new StringBuilder();
		boolean flag = true;
		for(char ch : s.toCharArray()) {			
			sb.append(flag ? Character.toUpperCase(ch) : Character.toLowerCase(ch));
			flag = (ch == ' ') ? true : false;
		}
		
        return sb.toString();
    }
}