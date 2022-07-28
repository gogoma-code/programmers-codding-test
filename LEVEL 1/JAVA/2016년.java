// 2016년 :: https://gogoma.tistory.com/103
// https://school.programmers.co.kr/learn/courses/30/lessons/12901?language=java
class Solution {
	public String solution(int a, int b) {
		String answer = "";
		int totalDay = 0;
		int dayOfMonth = 0;
		for(int i=1; i<a; i++) {
			if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8  || i == 10 || i == 12) dayOfMonth = 31;
			else if(i == 2) dayOfMonth = 29;
			else dayOfMonth = 30;
			
			totalDay += dayOfMonth;
		}
		totalDay += b;
		
		switch(totalDay % 7) {
		case 0:
			answer = "THU";
			break;
		case 1:
			answer = "FRI";
			break;
		case 2:
			answer = "SAT";
			break;
		case 3:
			answer = "SUN";
			break;
		case 4:
			answer = "MON";
			break;
		case 5:
			answer = "TUE";
			break;
		case 6:
			answer = "WED";
			break;
		
		}
		
		return answer;
	}
	
	public String solution2(int a, int b) {
		String[] days = { "THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED" };
		int[] numberOfDays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		int numberOfDaysSum = 0;
		for(int i=0; i<a-1; i++) {
			numberOfDaysSum += numberOfDays[i];
		}
		numberOfDaysSum += b;
		
		return days[numberOfDaysSum % 7];
	}
}