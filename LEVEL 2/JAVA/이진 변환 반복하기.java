// 이진 변환 반복하기
// https://school.programmers.co.kr/learn/courses/30/lessons/70129
class Solution {
    public int[] solution(String s) {
		int zeroCutCount = 0, chageCount = 0;
		while(!s.equals("1")) {
			int beforeLen = s.length();
			s = s.replace("0", "");
			int afterLen = s.length();
			s = Integer.toBinaryString(s.length());
			
			zeroCutCount += beforeLen - afterLen;
			chageCount++;
		}
		
        return new int[] { chageCount, zeroCutCount };
    }
}