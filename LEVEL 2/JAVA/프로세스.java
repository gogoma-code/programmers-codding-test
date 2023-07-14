// 프로세스
// https://school.programmers.co.kr/learn/courses/30/lessons/42587?language=java
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] priorities, int location) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i : priorities) list.add(i);
		int loc = location, cnt = 0;
		
		while (!list.isEmpty()) {
			int max_priority = list.get(0);
			for (int i = 1; i < list.size(); i++) {
				if (list.get(0) < list.get(i)) {
					if (loc == 0) loc = list.size() - 1;
					else loc--;

					int tmp_priority = list.get(0);
					list.remove(0);
					list.add(tmp_priority);
					max_priority = 0;
					break;
				}
			}

			if (max_priority != 0) {
				list.remove(0);
				cnt++;
				if (loc == 0) break;
				else loc--;
			}
		}

		return cnt;
	}
}