// 완주하지 못한 선수 :: https://gogoma.tistory.com/114
// https://school.programmers.co.kr/learn/courses/30/lessons/42576?language=java
import java.util.HashMap;

class Solution {
	public String solution(String[] participant, String[] completion) {
        String answer = new String();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(String runner : participant) map.put(runner, map.getOrDefault(runner, 0) + 1);
        for(String runner : completion) map.put(runner, map.get(runner) - 1);

        for(String runner : map.keySet()) {
            if(map.get(runner) != 0) {
            	answer = runner;
                break;
            }
        }

        return answer;
    }
}