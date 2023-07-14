// k진수에서 소수 개수 구하기
// https://school.programmers.co.kr/learn/courses/30/lessons/92335
class Solution {
    public int solution(int n, int k) {
		int count = 0;
		StringBuilder sb = new StringBuilder();
		while (n > 0) {
			int ins = n % k;
			if(ins != 0) {
				sb.insert(0, n % k);
			} else {
				if(sb.length() > 0) {
					long num = Long.parseLong(sb.toString());
					if (isPrime(num)) count++;
				}
				sb.setLength(0);
			}
			n /= k;
		}
		if(sb.length() > 0) {
			long num = Long.parseLong(sb.toString());
			if (isPrime(num)) count++;
		}
		
		return count;
	}

	public boolean isPrime(long num) {
		boolean isPrime = true;
		for (int i = 2; i <= (int) Math.sqrt(num); i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return num <= 1 ? false : isPrime;
	}
}