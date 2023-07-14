// 점프와 순간 이동
// https://school.programmers.co.kr/learn/courses/30/lessons/12980?language=java
class Solution {
    public int solution(int n) {
        int ans = 1;
		while(n != 1) {
			if(n % 2 != 0) ans++;
			n /= 2;
		}
        
        return ans;
    }
}