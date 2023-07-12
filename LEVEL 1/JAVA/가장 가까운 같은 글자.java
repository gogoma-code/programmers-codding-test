// 가장 가까운 같은 글자
// https://school.programmers.co.kr/learn/courses/30/lessons/142086
class Solution {
    public int[] solution(String s) {
		int[] alphabets = new int[26];
		for(int i=0; i<alphabets.length; i++) alphabets[i] = -1;
		
		int[] answer = new int[s.length()];
		char[] chars = s.toCharArray();
		for(int i=0; i<chars.length; i++) {
			int idx = chars[i] - 'a';
			
			if(alphabets[idx] == -1) {
				alphabets[idx] = i+1;
				answer[i] = -1;
			} else {
				answer[i] = (i+1) - alphabets[idx];
				alphabets[idx] = i+1;
			}
		}
		
        return answer;
    }
}