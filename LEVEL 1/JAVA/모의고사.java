// 모의고사 :: https://gogoma.tistory.com/111
// https://school.programmers.co.kr/learn/courses/30/lessons/42840?language=java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

class Solution {
	public int[] solution(int[] answers) {
		// 수포자 패턴
		int[][] supoja_pattern = {
				{ 1, 2, 3, 4, 5 },
				{ 2, 1, 2, 3, 2, 4, 2, 5 },
				{ 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 }
		};
		
		// 정답수 구하기
		List<Integer> answerList = Arrays.asList(0, 0, 0);
		for(int i=0; i<answerList.size(); i++) {
			for(int j=0; j<answers.length; j++) {
				if(supoja_pattern[i][j % supoja_pattern[i].length] == answers[j]) {
					answerList.set(i, answerList.get(i)+1);
				}
			}
		}
		
		// 정답 최댓값 구하기
		int max = Collections.max(answerList);
		List<Integer> maxList = new ArrayList<Integer>();
		for(int i=0; i<answerList.size(); i++) if(max == answerList.get(i)) maxList.add(i+1);
		
		// 반환 타입에 맞춰서 반환하기 위해 최댓값 수포자들 배열에 담기
		int[] answer = new int[maxList.size()];
		for(int i=0; i<maxList.size(); i++) answer[i] = maxList.get(i);
		
		return answer;
	}
	
	public int[] solution2(int[] answers) {
		int supoja = 3;
		int[][] supoja_pattern = {
				{ 1, 2, 3, 4, 5 },
				{ 2, 1, 2, 3, 2, 4, 2, 5 },
				{ 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 }
		};
		
		int[] answerAry = new int[supoja];
		for(int i=0; i<answerAry.length; i++) {
			for(int j=0; j<answers.length; j++) {
				if(supoja_pattern[i][j % supoja_pattern[i].length] == answers[j]) {					
					answerAry[i]++;
				}
			}
		}
		
		int max = Arrays.stream(answerAry).max().getAsInt();
		return IntStream.range(1, supoja+1).filter(i -> answerAry[i-1] == max).toArray();
	}
}