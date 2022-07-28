// 문자열 내 p와 y의 개수 :: https://gogoma.tistory.com/74
// https://school.programmers.co.kr/learn/courses/30/lessons/12916?language=java
class Solution {
	boolean solution(String s) {
		int total = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.substring(i, i+1).equalsIgnoreCase("p")) total++;
			else if(s.substring(i, i+1).equalsIgnoreCase("y")) total--;
		}
		
		return total == 0 ? true : false;
	}
	
	boolean solution2(String s) {
		int total = 0;
		for(char ch : s.toLowerCase().toCharArray()) {
			switch(ch) { 
				case 'p': total++; break;
				case 'y': total--; break;
			}
		}
		return total == 0;
	}
	
	boolean solution3(String s) {
		return s.replaceAll("[^yY]", "").length() - s.replaceAll("[^pP]", "").length() == 0;
	}
	
	boolean solution4(String s) {
		return s.chars().filter(ch -> ch == 'p' || ch == 'P').count() == s.chars().filter(ch -> ch == 'y' || ch == 'Y').count();
	}
}