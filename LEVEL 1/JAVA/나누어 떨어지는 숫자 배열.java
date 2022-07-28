// 나누어 떨어지는 숫자 배열 :: https://gogoma.tistory.com/99
// https://school.programmers.co.kr/learn/courses/30/lessons/12910?language=java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
	public int[] solution(int[] arr, int divisor) {
		int[] answer = Arrays.stream(arr).filter(i -> i % divisor == 0).sorted().toArray();
		return answer.length == 0 ? new int[] { -1 } : answer;
	}

	public int[] solution2(int[] arr, int divisor) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i : arr) {
			if (i % divisor == 0) list.add(i);
		}
		list.sort( (a, b) -> { return a - b; } );

		int[] answer;
		if (list.isEmpty()) {
			answer = new int[] { -1 };
		} else {
			answer = new int[list.size()];
			for (int i = 0; i < list.size(); i++) answer[i] = list.get(i);
		}

		return answer;
	}
}
