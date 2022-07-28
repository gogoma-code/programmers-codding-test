// 로또의 최고 순위와 최저 순위 :: https://gogoma.tistory.com/126
// https://school.programmers.co.kr/learn/courses/30/lessons/77484?language=java
class Solution {
	public int[] solution(int[] lottos, int[] win_nums) {
		int count_zero = 0, count_hit = 0; // 낙서된 수(zero), 당첨 번호 수(hit)
		for(int lotto : lottos) {
			if(lotto == 0) count_zero++; // 낙서된 수 증가
			
			for(int win_num : win_nums) {
				if(lotto == win_num) {
					count_hit++; // 당첨 번호 수 증가
				}
			}
		}
		
        return new int[] { getLottoRanking(count_hit+count_zero), getLottoRanking(count_hit) };
    }
	
	public int getLottoRanking(int hit) {
		switch(hit) {
			case 6: return 1;
			case 5: return 2;
			case 4: return 3;
			case 3: return 4;
			case 2: return 5;
			default: return 6;
		}
	}
	
	public int[] solution2(int[] lottos, int[] win_nums) {
		int count_zero = 0, count_hit = 0; // 낙서된 수(zero), 당첨 번호 수(hit)
		for(int lotto : lottos) {
			if(lotto == 0) count_zero++; // 낙서된 수 증가
			
			for(int win_num : win_nums) {
				if(lotto == win_num) {
					count_hit++; // 당첨 번호 수 증가
				}
			}
		}
		
		int rank_high = 7 - (count_hit+count_zero);
		int rank_low = 7 - count_hit;
		
		rank_high = rank_high > 6 ? 6 : rank_high;
		rank_low = rank_low > 6 ? 6 : rank_low;
		
        return new int[] { rank_high, rank_low };
    }
}