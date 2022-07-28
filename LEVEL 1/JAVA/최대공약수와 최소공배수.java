// 최대공약수와 최소공배수 :: https://gogoma.tistory.com/32
// https://school.programmers.co.kr/learn/courses/30/lessons/12940?language=java
import java.math.BigInteger;

class Solution {
	public int[] solution(int n, int m) {
		int gcd = BigInteger.valueOf(m).gcd(BigInteger.valueOf(n)).intValue();
		int lcm = n * m / gcd;

		return new int[] { gcd, lcm };
	}
	
	public int[] solution2(int n, int m) {		
		int gcd = gcd(n, m%n);
		int lcm = n * m / gcd;
		
		System.out.println(gcd + "," + lcm);

		return new int[] {gcd, lcm};
	}
	
	public int gcd(int a, int r) {
		return (r == 0) ? a : gcd(r, a%r);
	}
}