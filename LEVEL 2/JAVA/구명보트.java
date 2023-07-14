// 구명보트
// https://school.programmers.co.kr/learn/courses/30/lessons/42885
import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
		
		int answer = 0, startIdx = 0, endIdx = people.length-1;
		while(startIdx <= endIdx) {
			if(people[startIdx] + people[endIdx] <= limit) {
				startIdx++;
			} 
			endIdx--;
			answer++;
		}
		
        return answer;
    }
}