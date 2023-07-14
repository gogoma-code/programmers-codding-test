// 영어 끝말잇기
// https://school.programmers.co.kr/learn/courses/30/lessons/12981?language=java
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int n, String[] words) {
		Set<String> set = new HashSet<String>();
		String lastWord = new String("");
		int cnt = 1;
		
		for(String word : words) {
			if(!lastWord.equals("") && !word.startsWith(lastWord)) {
				break;
			}
			if(!set.add(word)) {
				break;
			}
			lastWord = String.valueOf(word.charAt(word.length()-1));
			cnt++;
		}
		
		int num = 0, turn = 0;
		if(words.length != set.size()) {
			num = (cnt % n == 0) ? n : cnt % n;
			turn = (cnt % n == 0) ? cnt / n : cnt / n + 1;
		}
		
        return new int[] {num, turn};
    }
}