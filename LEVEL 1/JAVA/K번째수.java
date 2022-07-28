// K번째수 :: https://gogoma.tistory.com/113
// https://school.programmers.co.kr/learn/courses/30/lessons/42748?language=java
import java.util.Arrays;

class Solution {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		
		for(int m = 0; m<commands.length; m++) {
			int i = commands[m][0];
			int j = commands[m][1];
			int k = commands[m][2];
			
			int[] slices = Arrays.copyOfRange(array, i-1, j);
			Arrays.sort(slices);
			answer[m] = slices[k-1];
		}
		return answer;
	}
	
	public int[] solution2(int[] array, int[][] commands) {
		int answer[] = new int[commands.length];
		
		for(int m=0; m<commands.length; m++) {
			int i = commands[m][0];
			int j = commands[m][1];
			int k = commands[m][2];
			
			int[] slices = new int[j-i+1];
			int idx = 0;
			for(int a=i-1; a<j; a++) slices[idx++] = array[a];
			
			for(int o1=0; o1<k; o1++) {
				for(int o2=o1+1; o2<slices.length; o2++) {
					if(slices[o1] > slices[o2]) {
						int tmp = slices[o1];
						slices[o1] = slices[o2];
						slices[o2] = tmp;
					}
				}
			}
			
			answer[m] = slices[k-1];
		}
		
		return answer;
	}
}