// 문자열 다루기 기본 :: https://gogoma.tistory.com/44
// https://school.programmers.co.kr/learn/courses/30/lessons/12918?language=java
class Solution {
	public boolean solution(String s) {
		int len = s.length();
		if (len == 4 || len == 6) {
			for (char ch : s.toCharArray()) {
				if (ch < '0' || ch > '9')
					return false;
			}
			return true;
		}
		return false;
	}

	public boolean solution2(String s) {
		int len = s.length();
		return (len == 4 || len == 6) && s.matches("\\d*");
	}

	public boolean solution3(String s) {
		int len = s.length();
		if (len == 4 || len == 6) {
			try {
				Integer.parseInt(s);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}
		} else {
			return false;
		}
	}
}