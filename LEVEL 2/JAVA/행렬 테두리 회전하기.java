// 행렬 테두리 회전하기
// https://school.programmers.co.kr/learn/courses/30/lessons/77485
class Solution {
    int[][] array;

	public int[] solution(int rows, int columns, int[][] queries) {
		int[] answer = new int[queries.length];
		array = new int[rows][columns];
		array = createArray(rows, columns);

		for (int i = 0; i < queries.length; i++) {
			answer[i] = rotateArray(queries[i]);
		}
		
		return answer;
	}

	public int[][] createArray(int rows, int columns) {
		int num = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = num++;
			}
		}

		return array;
	}

	public int rotateArray(int[] query) {
		int x1 = query[0] - 1, y1 = query[1] - 1;
		int x2 = query[2] - 1, y2 = query[3] - 1;
		int min = Integer.MAX_VALUE;

		// (x1, y1) -> (x1, y2)
		int rotate = array[x1][y1];
		for (int y = y1; y < y2; y++) {
			min = Math.min(min, rotate);
			int temp = array[x1][y + 1];
			array[x1][y + 1] = rotate;
			rotate = temp;
		}

		// (x1, y2) -> (x2, y2)
		for (int x = x1; x < x2; x++) {
			min = Math.min(min, rotate);
			int temp = array[x + 1][y2];
			array[x + 1][y2] = rotate;
			rotate = temp;
		}

		// (x2, y2) -> (x2, y1)
		for (int y = y2; y > y1; y--) {
			min = Math.min(min, rotate);
			int temp = array[x2][y - 1];
			array[x2][y - 1] = rotate;
			rotate = temp;
		}

		// (x2, y1) -> (x1, y1)
		for (int x = x2; x > x1; x--) {
			min = Math.min(min, rotate);
			int temp = array[x - 1][y1];
			array[x - 1][y1] = rotate;
			rotate = temp;
		}

		return min;
	}
}