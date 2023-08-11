// 귤 고르기
// https://school.programmers.co.kr/learn/courses/30/lessons/138476
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int solution(int k, int[] tangerine) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int t : tangerine) {
			map.put(t, map.getOrDefault(t, 0)+1);
		}
		
		List<Integer> values = new ArrayList<>(map.values());
		values.sort(Comparator.reverseOrder());
		
		int answer = 0;
		for (Integer value : values) {
			k -= value;
			answer++;
			
			if(k <= 0) break;
        }
		
        return answer;
    }
}