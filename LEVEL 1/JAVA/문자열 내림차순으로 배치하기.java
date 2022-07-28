// 문자열 내림차순으로 배치하기 :: https://gogoma.tistory.com/96
// https://school.programmers.co.kr/learn/courses/30/lessons/12917?language=java
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
	public String solution(String s) {
		char[] array = s.toCharArray();
		Arrays.sort(array);
		return new StringBuilder(new String(array)).reverse().toString();
	}
	
	public String solution2(String s) {
		return Stream.of(s.split(""))
				.sorted(Collections.reverseOrder())
				.collect(Collectors.joining());
	}
	
	public String solution3(String s) {
		char[] s_arr = s.toCharArray();
		for(int i=0; i<s_arr.length-1; i++) {
			int max = i;
			for(int j=i+1; j<s_arr.length; j++) {
				if(s_arr[max] < s_arr[j]) max = j;
			}
			
			char tmp = s_arr[max];
			s_arr[max] = s_arr[i];
			s_arr[i] = tmp;
		}
		
		return new String(s_arr);
	}
}