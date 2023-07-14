// 멀쩡한 사각형
// https://school.programmers.co.kr/learn/courses/30/lessons/62048?language=java
class Solution {
    public long gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
	
	public long solution(int w, int h) {
		return ((long)w * h) - ((long)w + h - gcd(w, h));
    }
}