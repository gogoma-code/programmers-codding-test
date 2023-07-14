// 다리를 지나는 트럭
// https://school.programmers.co.kr/learn/courses/30/lessons/42583
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0, sum = 0, i = 0;
		Queue<Integer> timeQ = new LinkedList<Integer>();
		Queue<Integer> truckQ = new LinkedList<Integer>();
		
		while(true) {
			if(!truckQ.isEmpty() && timeQ.peek() == time) {
				timeQ.poll();
				sum -= truckQ.poll();
			}
			
			if(i < truck_weights.length && sum + truck_weights[i] <= weight) {
				timeQ.offer(time + bridge_length);
				truckQ.offer(truck_weights[i]);
				sum += truck_weights[i];
				i++;
			}
			
			time++;
			if(timeQ.isEmpty()) { break; }
		}
		
		return time;
    }
}