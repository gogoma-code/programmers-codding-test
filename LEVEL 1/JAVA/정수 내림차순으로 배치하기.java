// 정수 내림차순으로 배치하기 :: https://gogoma.tistory.com/36
// https://school.programmers.co.kr/learn/courses/30/lessons/12933?language=java
import java.util.Arrays;
import java.util.Comparator;

class Solution {
	public long solution(long n) {
		String[] nArr = String.valueOf(n).split("");
		Arrays.sort(nArr);

		StringBuilder sb = new StringBuilder();
		for (int i = nArr.length - 1; i >= 0; i--) sb.append(nArr[i]);

		return Long.parseLong(sb.toString());
	}
		
	public long solution2(long n) {
		StringBuilder sb = new StringBuilder();
		String.valueOf(n).chars()
			.mapToObj(ch -> (char) ch)
			.sorted(Comparator.reverseOrder())
			.forEach(ch -> sb.append(ch));
		
		return Long.parseLong(sb.toString());
	}
	
	public long solution3(long n) {
		char[] sort = String.valueOf(n).toCharArray();
		int tmp = 0;
		for(int i=0; i<sort.length; i++) {
			for(int j=i+1; j<sort.length; j++) {
				if(sort[i] < sort[j]) {
					tmp = sort[i];
					sort[i] = sort[j];
					sort[j] = (char) tmp;
				}
			}
		}
		
		return Long.parseLong(String.valueOf(sort));
	}
}