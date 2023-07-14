// 달리기 경주
// https://school.programmers.co.kr/learn/courses/30/lessons/178871
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
		Map<String, Integer> map = new HashMap<>();
		for(int i=0; i<players.length; i++) {
			map.put(players[i], i);
		}
		
		for(String calling : callings) {
			int rank = map.get(calling);
			
			map.put(players[rank-1], rank);
			map.put(calling, rank-1);
			
			players[rank] = players[rank-1];
			players[rank-1] = calling;		 
		}
		
		return players;
	}
}