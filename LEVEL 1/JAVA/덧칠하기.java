// 덧칠하기
// https://school.programmers.co.kr/learn/courses/30/lessons/161989
class Solution {
    public int solution(int n, int m, int[] section) {
		int answer = 0, roll = 0;
		for(int s : section) {
			if(roll < s) {
				roll = s + m - 1;
				answer++;
			}
		}
		
        return answer;
    }
}