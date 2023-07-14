// 튜플
// https://school.programmers.co.kr/learn/courses/30/lessons/64065?language=java
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(String s) {
		Set<String> set = new HashSet<String>();
		String[] split = s.replaceAll("[{|}]", " ").trim().split(" , ");
		Arrays.sort(split, (o1, o2)->{return o1.length()-o2.length();});
		
		int[] answer = new int[split.length];
		int idx = 0;
		for(int i=0; i<split.length; i++) {
			for(String str : split[i].split(",")) {
				if(set.add(str)) {
					answer[idx++] = Integer.parseInt(str);
				}
			}
		}
		
		return answer;
	}
}