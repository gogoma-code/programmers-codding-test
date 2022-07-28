// 콜라츠 추측 :: https://gogoma.tistory.com/55
// https://school.programmers.co.kr/learn/courses/30/lessons/12943?language=java
class Solution {	
	public int solution(int num) {
		long numL = num;
		for(int cnt=0; cnt<500; cnt++) {
			if(numL == 1) return cnt;
			
			numL = (numL%2 == 0) ? numL/2 : numL*3+1;
		}
		
		return -1;
	}
}