// x만큼 간격이 있는 n개의 숫자
// https://school.programmers.co.kr/learn/courses/30/lessons/12954?language=java
import java.util.stream.LongStream;

class Solution {
	// 풀이-1
	public long[] solution(int x, int n) {
		long[] arr = new long[n];
		long next = 0;
		for(int i=0; i<arr.length; i++) arr[i] = next += x;
		
		return arr;
	}
	
	// 풀이-2
	public long[] solution2(int x  , int n) {
		return LongStream.iterate(x, i->i+x).limit(n).toArray();
	}
}