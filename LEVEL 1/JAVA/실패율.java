// 실패율 :: https://gogoma.tistory.com/110
// https://school.programmers.co.kr/learn/courses/30/lessons/42889?language=java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Solution {
	public int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		List<Integer> answer_list = new ArrayList<>();
		List<Double> failure_list = new ArrayList<>();
		List<Integer> stages_list = new ArrayList<>(stages.length);
		for(int stage : stages) stages_list.add(stage);
		
		double failPercent = 0.0;
		int failCnt = 0, totalCnt = 0;
		for(int i=1; i<=N; i++) {
			totalCnt = stages_list.size();
			for(int j=0; j<stages_list.size(); j++) {
				if(i >= stages_list.get(j)) {
					failCnt++;
					stages_list.remove(j);
					j--;
				}
			}
			
			failPercent = (double)failCnt / totalCnt;
			failCnt = 0;
			failure_list.add(failPercent);
			for(int j=0; j<failure_list.size(); j++) {
				if(j == failure_list.size()-1) {
					answer_list.add(i);
					break;
				}
				
				if(failPercent > failure_list.get(answer_list.get(j)-1)) {
					answer_list.add(j, i);
					break;
				}
			}
		}
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = answer_list.get(i);
		}
		return answer;
    }
	
	public int[] solution2(int N, int[] stages) {
		List<Integer> stagesList = new ArrayList<Integer>();
		List<Double> failureList = new ArrayList<>();
		List<Integer> answerList = new ArrayList<>();
		
		for(int stage : stages) stagesList.add(stage);
		
		for(int i=1; i<=N; i++) {
			int challenger = stagesList.size();
			Iterator<Integer> iter = stagesList.iterator();
			while(iter.hasNext()) {
				if(iter.next() <= i) iter.remove();
			}
			
			double failureRate = (double)(challenger - stagesList.size()) / challenger;
			failureList.add(failureRate);
			
			for(int j=0; j<failureList.size(); j++) {
				if(j == failureList.size()-1) {
					answerList.add(i);
					break;
				}
				if(failureRate > failureList.get(answerList.get(j)-1)) {
					answerList.add(j, i);
					break;
				}
			}
		}
		
		int[] answer = new int[N];
		for(int i=0; i<answer.length; i++) {
			answer[i] = answerList.get(i);
		}
		
		return answer;
	}
}