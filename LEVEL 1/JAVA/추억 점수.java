// 추억 점수
// https://school.programmers.co.kr/learn/courses/30/lessons/176963
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
		Map<String, Integer> yearningMap = new HashMap<>();
		for(int i=0; i<name.length; i++) {
			yearningMap.put(name[i], yearning[i]);
		}
		
		int[] answer = new int[photo.length];
		for(int i=0; i<photo.length; i++) {
			for(int j=0; j<photo[i].length; j++) {
				int score = yearningMap.getOrDefault(photo[i][j], 0);
				answer[i] += score;
			}
		}
        
        return answer;
    }
}