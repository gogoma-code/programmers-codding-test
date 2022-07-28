// 제일 작은 수 제거하기 :: https://gogoma.tistory.com/33
// https://school.programmers.co.kr/learn/courses/30/lessons/12935?language=java
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Solution {
	public int[] solution(int[] arr) {
		if(arr.length <= 1) return new int[] {-1};
		
		// 배열을 리스트로 변환하면서 가장 작은 수 찾기
		int min = Integer.MAX_VALUE;
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++) {
			list.add(arr[i]);
			if(min > arr[i]) min = arr[i];
		}
		
		// 가장 작은 수 제거 후 리스트를 새로운 배열로 변환
		list.remove(list.indexOf(min));
		int[] newArr = new int[list.size()];
		for(int i=0; i<newArr.length; i++) newArr[i] = list.get(i);
		
		return newArr;
	}
	
	public int[] solution2(int[] arr) {		
		if(arr.length == 1) return new int[] {-1};
		
		// 순서대로 탐색하며 가장 작은 수 찾기
		int min = Integer.MAX_VALUE;
		for(int a : arr) {
			if(min > a) min = a;
		}
		
		// 위에서 찾은 가장 작은 수를 제외하고 새로운 배열 만들기
		int[] newArr = new int[arr.length-1];
		int index = 0;
		for(int a : arr) {
			if(min != a) newArr[index++] = a;
		}
		
		return newArr;
	}
	
	public int[] solution3(int[] arr) {		
		if(arr.length == 1) return new int[] {-1};
		
		int min = IntStream.of(arr).min().getAsInt();
		return IntStream.of(arr).filter(i -> i != min).toArray();
	}
}