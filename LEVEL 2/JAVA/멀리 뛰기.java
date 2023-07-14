// 멀리 뛰기
// https://school.programmers.co.kr/learn/courses/30/lessons/12914
class Solution {
    public long solution(int n) {
		int mod = 1234567;
		long r1=1, r2=1;
		
		int count = 1;
		while(count < n) {
			long temp = r2;
			r2 = (r1 + r2) % mod;
			r1 = temp;
			count++;
		}
		
		return r2 % mod;
    }
}