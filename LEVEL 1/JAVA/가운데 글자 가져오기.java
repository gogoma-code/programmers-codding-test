// 가운데 글자 가져오기 :: https://gogoma.tistory.com/86
// https://school.programmers.co.kr/learn/courses/30/lessons/12903?language=java
class Solution {
	public String solution(String s) {
		int len = s.length();
		return s.substring((len-1) / 2, (len/2) + 1);
	}
}