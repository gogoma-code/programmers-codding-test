
// 뒤에 있는 큰 수 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/154539
import java.util.Stack;

class Solution {
    public int[] solution_timeout(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int bigger = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (bigger < numbers[j]) {
                    bigger = numbers[j];
                    break;
                }
            }

            answer[i] = (bigger == numbers[i]) ? -1 : bigger;
        }

        return answer;
    }

    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < numbers.length; i++) {
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                answer[stack.pop()] = numbers[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        return answer;
    }
}