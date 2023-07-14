// 기능개발
// https://school.programmers.co.kr/learn/courses/30/lessons/42586?language=java
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
		int baepoCnt = 1, dayCnt = 0, tmpCnt;
		String answer = new String();
		
		if(progresses.length > 0) dayCnt = (int) Math.ceil( (100-progresses[0]) / (double)speeds[0] );
		
		for(int i=1; i<progresses.length; i++) {
			tmpCnt = (int) Math.ceil( (100-progresses[i]) / (double)speeds[i] );
			
			if(dayCnt < tmpCnt) { 
				answer += Integer.toString(baepoCnt) + ",";
				dayCnt = tmpCnt;
				baepoCnt = 0;
			}
			baepoCnt++;
		}
		if(baepoCnt > 0) answer += Integer.toString(baepoCnt);
		
		String[] returns_str = answer.split(",");
		int[] returns = new int[returns_str.length];
		for(int i=0; i<returns.length; i++) {
			returns[i] = Integer.parseInt(returns_str[i]);
		}
		
		return returns;
	}
}