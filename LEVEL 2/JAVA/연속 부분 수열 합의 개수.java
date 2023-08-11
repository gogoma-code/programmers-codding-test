// 연속 부분 수열 합의 개수
// https://school.programmers.co.kr/learn/courses/30/lessons/131701
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] elements) {
		Set<Integer> set = new HashSet<>();
		int length = 1, eleLength = elements.length;
		
		while(length <= eleLength) {
			for(int i=0; i<eleLength; i++) {
				int sum = 0, count = 0;
				while(count < length) {
					int idx = (i + count) % eleLength;
					
					sum += elements[idx];
					count++;
				}
				set.add(sum);
			}
			length++;
		}
        
        return set.size();
    }
}