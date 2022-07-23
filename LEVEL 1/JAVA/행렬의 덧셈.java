// 행렬의 덧셈 :: https://gogoma.tistory.com/30
// https://school.programmers.co.kr/learn/courses/30/lessons/12950?language=java
import java.util.stream.IntStream;

public class Solution {
    // 풀이-1
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] arr = new int[arr1.length][arr1[0].length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				arr[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return arr;
	}

    // 풀이-2
	public int[][] solution2(int[][] arr1, int[][] arr2) {
		int[][] arr = new int[arr1.length][arr1[0].length];
		IntStream.range(0, arr1.length)
				.forEach(i -> IntStream.range(0, arr1[0].length).forEach(j -> arr[i][j] = arr1[i][j] + arr2[i][j]));
		return arr;
	}
}