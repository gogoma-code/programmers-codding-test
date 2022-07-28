// 나머지가 1이 되는 수 찾기 :: https://gogoma.tistory.com/102
// https://school.programmers.co.kr/learn/courses/30/lessons/87389?language=java
import java.util.stream.IntStream;

class Solution {
	public int solution(int n) {
		int answer = 0;
		for(int i=2; i<n; i++) {
			if(n % i == 1) {
				answer = i;
				break;
			}
		}
        return answer;
    }
	
	public int solution2(int n) {
		return IntStream.range(2, n).filter(i -> n % i == 1).min().getAsInt();
	}
}