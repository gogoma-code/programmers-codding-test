// [3차] n진수 게임
// https://school.programmers.co.kr/learn/courses/30/lessons/17687?language=java
class Solution {
    public String solution(int n, int t, int m, int p) {
		int num = 0;
		String conversionResult = new String("");
		while(true) {
			conversionResult += conversion(n, num);
			num++;
			
			if(conversionResult.length() / m > t) break;
		}
		
		String answer = new String("");
		for(int i=p-1; answer.length()<t; i+=m) {
			answer += conversionResult.charAt(i);
		}
		
        return answer;
    }
	
	public String conversion(int n, int num) {
		String[] picked = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
				"A", "B", "C", "D", "E", "F"};
		String result = new String("");
		while(num != 0) {
			result = picked[num % n] + result;
			num /= n;
		}
		
		return result.equals("") ? "0" : result;
	}
}