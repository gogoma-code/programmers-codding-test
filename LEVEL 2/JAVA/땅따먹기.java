// 땅따먹기
// https://school.programmers.co.kr/learn/courses/30/lessons/12913
class Solution {
    public int solution(int[][] land) {
		int row = land.length, col = land[0].length;
		
		for(int i=1; i<row; i++) {
			for(int j=0; j<col; j++) {
				int max = 0;
				for(int k=0; k<col; k++) {
					if(k != j) { max = Math.max(max, land[i-1][k]); }
				}
				land[i][j] += max;
			}
		}
		
		int max = 0;
		for(int j=0; j<col; j++) {
			max = Math.max(max, land[row-1][j]);
		}
		
		return max;
    }
}