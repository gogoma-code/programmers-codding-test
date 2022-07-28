// 체육복 :: https://gogoma.tistory.com/112
// https://school.programmers.co.kr/learn/courses/30/lessons/42862?language=java
import java.util.ArrayList;
import java.util.List;

class Solution {
	public int solution(int n, int[] lost, int[] reserve) {
		int okMember = n - lost.length;
		
		List<Integer> lostList = new ArrayList<Integer>();
		for (int i : lost) lostList.add(i);

		List<Integer> reserveList = new ArrayList<Integer>();
		for (int i : reserve) reserveList.add(i);
		
        for(int i=0; i<lostList.size(); i++) {
			for(int j=0; j<reserveList.size(); j++) {
				if(lostList.get(i) == reserveList.get(j)) {
					lostList.remove(i);
					reserveList.remove(j);
                    i--;
					okMember++;
					break;
				}
			}
		}
    
		for (int i = 0; i < lostList.size(); i++) {
			int lostNum = lostList.get(i);
			for (int j = 0; j < reserveList.size(); j++) {
				int reserveNum = reserveList.get(j);
				if (lostNum == reserveNum - 1 || lostNum == reserveNum + 1) {
					reserveList.remove(j);
					okMember++;
					break;
				}
			}
		}

		return okMember;
	}
	
	public int solution2(int n, int[] lost, int[] reserve) {
		int[] haves = new int[n+2]; // 0번째 인덱스와, 마지막 인덱스는 비워두는 용도
		int answer = n;
		
		for(int l : lost) haves[l]--;
		for(int r : reserve) haves[r]++;
		
		for(int i=1; i<=n; i++) {
			if(haves[i] == -1) {
				if(haves[i-1] > 0) {
					haves[i]++;
					haves[i-1]--;
				} else if(haves[i+1] > 0) {
					haves[i]++;
					haves[i+1]--;
				} else {
					answer--;
				}
			}
		}
		
		return answer;
	}
}