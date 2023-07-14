// [1차] 프렌즈4블록
// https://school.programmers.co.kr/learn/courses/30/lessons/17679?language=java
class Solution {
    public int solution(int m, int n, String[] board) {
		String[][] boards = new String[m][n];
		for(int i=0; i<m; i++) boards[i] = board[i].split("");
		
		int cnt = 0;
		while(true) {
			boolean flag = false;
			boolean[][] flagBoards = new boolean[m][n];
			for(int i=0; i<m; i++) {
				for(int j=0; j<n; j++) {
					if(i !=0 && j != 0) {
						String str = boards[i][j];
						if(str.length() > 0 && str.equals(boards[i-1][j-1]) && str.equals(boards[i-1][j]) && str.equals(boards[i][j-1])) {
							flag = true;
							flagBoards[i][j] = true; flagBoards[i-1][j-1] = true;
							flagBoards[i-1][j] = true; flagBoards[i][j-1] = true;
						}
					}
				}
			}
			
			if(!flag) break;
		
			for(int i=0; i<m; i++) {
				for(int j=0; j<n; j++) {
					if(flagBoards[i][j]) {
						cnt++;
						for(int k=i; k>0; k--) {
							boards[k][j] = boards[k-1][j];
							boards[k-1][j] = "";
						}
					}
				}
			}
		} 
		
        return cnt;
    }
}