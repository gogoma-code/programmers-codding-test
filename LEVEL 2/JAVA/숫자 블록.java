// 숫자 블록
// https://school.programmers.co.kr/learn/courses/30/lessons/12923
class Solution {
    int block_limit = 10000000;
        
    public int[] solution(long begin, long end) {
		int b = (int) begin, e = (int) end;
		int[] answer = new int[e - b + 1];
		int idx = 0;
		
		for (int i = b; i <= e; i++) {
			answer[idx++] = getBlock(i);
		}
		return answer;
	}

	public int getBlock(int num) {
		if(num == 1) return 0;
		for(int i=2; i<=Math.sqrt(num); i++){
			if(num%i==0 && num/i <= block_limit){
				return num/i; 
            }
		}
		return 1;
	}
}