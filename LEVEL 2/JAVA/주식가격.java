// 주식가격
// https://school.programmers.co.kr/learn/courses/30/lessons/42584
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int second = 0;
        boolean declineFlag = false;

        for (int i = 0; i < prices.length; i++) {
            second = 0;
            declineFlag = false;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] > prices[j]) {
                    declineFlag = true;
                    second = j - i;
                    break;
                }
            }
            second = declineFlag ? second : prices.length - 1 - i;
            answer[i] = second;
        }

        return answer;
    }
}