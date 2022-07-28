// 평균 구하기 :: https://gogoma.tistory.com/26
// https://school.programmers.co.kr/learn/courses/30/lessons/12944?language=java
import java.util.stream.IntStream;

class Solution {
	public double solution(int[] arr) {
		int sum = 0;
		for (int num : arr)
			sum += num;
		return (double) sum / arr.length;
	}
	
	public double solution2(int[] arr) {
		return IntStream.of(arr).average().getAsDouble();
	}
}