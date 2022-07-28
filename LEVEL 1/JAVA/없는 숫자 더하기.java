// 없는 숫자 더하기 :: https://gogoma.tistory.com/119
// https://school.programmers.co.kr/learn/courses/30/lessons/86051?language=java
class Solution {
	public int solution(int[] numbers) {
		int answer = 0;
		for(int i=1; i<=9; i++) {
			boolean isContain = false;
			for(int j=0; j<numbers.length; j++) {
				if(i == numbers[j]) {
					isContain = true;
					break;
				}
			}
			if(!isContain) answer += i;
		}
		
		return answer;
	}
	
	public int solution2(int[] numbers) {
		int answer = 45;
		for(int num : numbers) {
			answer -= num;
		}
		return answer;
	}
}