// 소수 만들기 :: https://gogoma.tistory.com/116
// https://school.programmers.co.kr/learn/courses/30/lessons/12977?language=java
class Solution {
	public int solution(int[] nums) {
		int cnt = 0;
		for(int i=0; i<nums.length - 2; i++) {
			for(int j=i+1; j<nums.length - 1; j++) {
				for(int k=j+1; k<nums.length; k++) {
					if(isPrime(nums[i] + nums[j] + nums[k])) {
						cnt++;
					}
				}
			}
		}
		
        return cnt;
    }
	
	public boolean isPrime(int num) {
		boolean isPrime = true;
		for(int i=2; i<=(int)Math.sqrt(num); i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}