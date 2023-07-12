// 과일 장수 
// https://school.programmers.co.kr/learn/courses/30/lessons/135808

class Solution {
    public int solution(int k, int m, int[] score) {
		int[] counts = new int[k+1];
		
		for(int s : score) counts[s]++;
		
		int answer = 0, left = 0;
		for(int i=counts.length-1; i>=0; i--) {
			counts[i] += left;
			
			answer += i * m * (counts[i] / m);
			left = counts[i] % m;
		}
		
        return answer;
    }

    // 시간초과 코드
    public int solution_failure(int k, int m, int[] score) {
		int answer = 0, putIn = 0, left = score.length;
		while(left >= 0) {
			for(int i=0; i<score.length; i++) {
				if(score[i] == k) {
					putIn++;
					
					if(putIn == m) {
						putIn = 0;
						answer += k * m;
					}
				}
			}
			
			k--;
			left--;
		}
        
        return answer;
    }
}