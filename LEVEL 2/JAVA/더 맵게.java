// 더 맵게
// https://school.programmers.co.kr/learn/courses/30/lessons/42626
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(int[] scoville, int K) {
        Queue<Integer> pQue = new PriorityQueue<Integer>();
        for (int num : scoville)
            pQue.offer(num); /* 1 */

        int cnt = 0;
        while (pQue.peek() < K) { /* 2 */
            if (pQue.size() == 1)
                return -1; /* 3 */

            /* 4 */
            pQue.offer(pQue.poll() + (pQue.poll() * 2));
            cnt++;
        }

        return cnt;
    }
}