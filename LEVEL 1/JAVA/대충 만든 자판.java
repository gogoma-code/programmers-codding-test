// 대충 만든 자판
// https://school.programmers.co.kr/learn/courses/30/lessons/160586
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
		int[] alphabet = new int[26];
		
		for(String map : keymap) {
			char[] keys = map.toCharArray();
			for(int i=0; i<keys.length; i++) {
				int idx = keys[i]-65;
				if(alphabet[idx] == 0) {
					alphabet[idx] = i+1;
				} else {
					alphabet[idx] = i < alphabet[idx] ? (i+1) : alphabet[idx]; 
				}
			}
		}
		
		int[] answers = new int[targets.length];
		for(int i=0; i<targets.length; i++) {
			
			int answer = 0;
			for(char ch : targets[i].toCharArray()) {
				int put = alphabet[ch - 65];
				if(put == 0) {
					answer = -1;
					break;
				}
				
				answer += put;
			}
			
			answers[i] = answer;
		}
		
		return answers;
    }


    public int[] solution2(String[] keymap, String[] targets) {
		Map<Character, Integer> hashMap = new HashMap<>();
		for(String map : keymap) {
			char[] keys = map.toCharArray();
			for(int i=0; i<keys.length; i++) {
				Character key = Character.valueOf(keys[i]);
				
				int put = hashMap.getOrDefault(key, -1);
				if(put == -1) hashMap.put(key, (i+1));
				else hashMap.put(key, (i < put) ? (i+1) : put);
			}
		}
		
		int[] answers = new int[targets.length];
		for(int i=0; i<targets.length; i++) {
			int answer = 0;
			for(char ch : targets[i].toCharArray()) {
				int put = hashMap.getOrDefault(Character.valueOf(ch), -1);
				if(put == -1) {
					answer = -1;
					break;
				}
				
				answer += put;
			}
			
			answers[i] = answer;
		}
		
        return answers;
    }
}