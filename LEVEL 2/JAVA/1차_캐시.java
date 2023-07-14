// [1차] 캐시
// https://school.programmers.co.kr/learn/courses/30/lessons/17680?language=java
import java.util.LinkedList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
		LinkedList<String> list = new LinkedList<String>();
		int totalTime = 0, time = 0;
		
		if(cacheSize == 0) {
			totalTime = cities.length * 5;
		} else {
			for(String city: cities) {
                city = city.toLowerCase();
				if(list.isEmpty()) {
					list.add(city);
					time = 5;
				} else {
					if(list.contains(city)) {
						list.remove(city);
						list.addLast(city);
						time = 1;
					} else {
						if(list.size() + 1 > cacheSize) {
							list.removeFirst();
						}
						list.add(city);
						time = 5;
					}
				}
				
				totalTime += time;
			}
		}
		
		
        return totalTime;
    }
}