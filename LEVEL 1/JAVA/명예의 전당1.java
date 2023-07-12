// 명예의 전당 (1)
// https://school.programmers.co.kr/learn/courses/30/lessons/138477
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();

        int min = 0;
        for (int i = 0; i < score.length; i++) {
            if (list.size() <= k || (list.size() == k && min < score[i])) {
                boolean isInsert = false;
                for (int j = 0; j < list.size(); j++) {
                    if (score[i] < list.get(j)) {
                        list.add(j, score[i]);
                        isInsert = true;
                        break;
                    }
                }
                if (!isInsert)
                    list.add(score[i]);
                if (k < list.size())
                    list.remove(0);

                min = list.get(0);
                answer[i] = min;
            }
        }

        return answer;
    }

    public int[] solution2(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        for (int i = 0; i < score.length; i++) {
            pQueue.add(score[i]);

            if (k < pQueue.size()) {
                pQueue.poll();
            }

            answer[i] = pQueue.peek();
        }

        return answer;
    }
}