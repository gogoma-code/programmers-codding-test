// 1차 다트게임 :: https://gogoma.tistory.com/100
// https://school.programmers.co.kr/learn/courses/30/lessons/17682?language=java
import java.util.Stack;

class Solution {
	public int solution(String dartResult) {
		int array[] = new int[3];
		int idx = -1, count = 0;

		for (int i = 0; i < dartResult.length(); i++) {
			char dart = dartResult.charAt(i);
			if (Character.isDigit(dart)) {
				int dartInt = Character.getNumericValue(dart);
				if (dartInt == 1 && dartResult.charAt(i + 1) == '0') {
					dartInt = 10;
					i++;
				}
				array[1 + (idx++)] = dartInt;
				count++;
			} else {
				int prev = array[idx];
				switch (dart) {
				case 'S':
					break;
				case 'D':
					prev = prev * prev;
					break;
				case 'T':
					prev = prev * prev * prev;
					break;
				case '*':
					prev *= 2;
					if (count > 1) {
						array[idx - 1] *= 2;
					}
					break;
				case '#':
					prev *= -1;
				}
				array[idx] = prev;
			}
		}

		int answer = 0;
		for (int score : array)
			answer += score;

		return answer;
	}

	public int solution2(String dartResult) {
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < dartResult.length(); i++) {
			char dart = dartResult.charAt(i);
			if (Character.isDigit(dart)) {
				int dartInt = Character.getNumericValue(dart);
				if (dartInt == 1 && dartResult.charAt(i + 1) == '0') {
					dartInt = 10;
					i++;
				}
				stack.push(dartInt);
			} else {
				int prev = stack.pop();
				switch (dart) {
				case 'D':
					prev = prev * prev;
					break;
				case 'T':
					prev = prev * prev * prev;
					break;
				case '*':
					prev *= 2;
					if (!stack.isEmpty()) {
						stack.push(stack.pop() * 2);
					}
					break;
				case '#':
					prev *= -1;
					break;
				}
				stack.push(prev);
			}
		}

		int answer = 0;
		while (!stack.isEmpty())
			answer += stack.pop();

		return answer;
	}
}