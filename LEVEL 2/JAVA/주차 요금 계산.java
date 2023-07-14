// 주차 요금 계산
// https://school.programmers.co.kr/learn/courses/30/lessons/92341
import java.util.Map;
import java.util.TreeMap;

class Solution {
    public int[] solution(int[] fees, String[] records) {
		Map<String, Integer> map = new TreeMap<>();
		for (String record : records) {
			String[] split_record = record.split(" ");
			String[] split_time = split_record[0].split(":");
			int time = (split_record[2].equals("IN") ? -1 : 1) * ((Integer.parseInt(split_time[0]) * 60) + Integer.parseInt(split_time[1]));
			String carNumber = split_record[1];
			
			map.put(carNumber, map.getOrDefault(carNumber, 0) + time);
		}

		int i = 0, lastTime = 1439;
		int[] answer = new int[map.size()];
		for (String key : map.keySet()) {
			int time = map.get(key);
			time = time <= 0 ? time + lastTime : time;
			double baseTime = time-fees[0] < 0 ? 0 : time-fees[0];	
			int price = fees[1] + (int) Math.ceil(baseTime / fees[2]) * fees[3];
			answer[i++] = price;
		}

		return answer;
	}
}