
// H-Index
// https://school.programmers.co.kr/learn/courses/30/lessons/42747?language=java
import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);

        int max = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            int min = (int) Math.min(citations[i], citations.length - i);
            if (max < min)
                max = min;
        }

        return max;
    }
}