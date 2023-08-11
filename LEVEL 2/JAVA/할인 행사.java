// 할인 행사
// https://school.programmers.co.kr/learn/courses/30/lessons/131127
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
		Map<String, Integer> wantMap = new HashMap<>();
		Map<String, Integer> dcMap = new HashMap<>();
		for(int i=0; i<want.length; i++) wantMap.put(want[i], number[i]);
		
		for(int i=0; i<10; i++) {
			if(wantMap.containsKey(discount[i])) {
				dcMap.put(discount[i], dcMap.getOrDefault(discount[i], 0) + 1);
			}
		}
		if(wantMap.equals(dcMap)) answer++;
		
		int minusIdx = 0;
		for(int i=10; i<discount.length; i++) {
			if(wantMap.containsKey(discount[minusIdx])) {
				dcMap.put(discount[minusIdx], dcMap.get(discount[minusIdx]) - 1);
			}
			minusIdx++;
			
			if(wantMap.containsKey(discount[i])) {
				dcMap.put(discount[i], dcMap.getOrDefault(discount[i], 0) + 1);
				if(wantMap.equals(dcMap)) answer++;
			}
		}
		
        return answer;
    }
}