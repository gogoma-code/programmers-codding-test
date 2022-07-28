// 하샤드 수 :: https://gogoma.tistory.com/45
// https://school.programmers.co.kr/learn/courses/30/lessons/12947?language=java
class Solution {
	// 풀이-1
	public boolean solution(int x) {
		int sum = 0;
		for(int tmp=x; tmp>0; tmp/=10) {
			sum += tmp % 10;
		}
		
		return x % sum == 0;
	}
	
	// 풀이-2
	public boolean solution2(int x) {
		int sum = 0;
		for(char ch : String.valueOf(x).toCharArray()) {
			sum += ch - 48;
		}
		
		return x % sum == 0;
	}
	
	// 풀이-3
	public boolean solution3(int x) {
		int sum = String.valueOf(x).chars().map(ch -> ch - 48).sum();
		return x % sum == 0;
	}
}
