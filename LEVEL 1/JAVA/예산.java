// 예산 :: https://gogoma.tistory.com/106
// https://school.programmers.co.kr/learn/courses/30/lessons/12982?language=java
import java.util.Arrays;

class Solution {
	public int solution(int[] d, int budget) {
		int sum = 0, cnt = 0;
		Arrays.sort(d);
		for(int num : d) {
			sum += num;
			if(sum > budget)
				break;
			cnt++;
		}
		
		return cnt;
	}
	
	public int solution2(int[] d, int budget) {
		Arrays.sort(d);
		int count = 0;
		for(int num : d) {
			budget -= num;
			if(budget < 0) break;
			
			count++;
		}
		
		return count;
	}
}