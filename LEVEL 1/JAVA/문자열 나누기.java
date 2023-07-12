// 문자열 나누기
// https://school.programmers.co.kr/learn/courses/30/lessons/140108
class Solution {
    public int solution(String s) {
        int answer = 0;
		char[] chars = s.toCharArray();
		
		char x = chars[0];
		int[] counts = new int[2];
		for(int i=0; i<chars.length; i++) {
			if(x == chars[i]) {
				counts[0]++;
			} else {
				counts[1]++;
			}
			
			if(counts[0] == counts[1]) {
				answer++;
				counts[0] = 0;
				counts[1] = 0;
				
				if((i + 1) < chars.length) {
					x = chars[i+1]; 
				}
			}
		}
		
		if(counts[0] != 0) answer++;
        
        return answer;
    }
}