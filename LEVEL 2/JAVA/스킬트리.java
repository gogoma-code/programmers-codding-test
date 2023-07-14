// 스킬트리
// https://school.programmers.co.kr/learn/courses/30/lessons/49993
class Solution {
    public int solution(String skill, String[] skill_trees) {
		int answer = skill_trees.length;
		
		/* 1 */
		int beforeIdx = 0, currentIdx = 0;
		for (int i = 0; i < skill_trees.length; i++) {
			/* 2 */
			beforeIdx = skill_trees[i].indexOf(skill.charAt(0));
			
			/* 3 */
			for (int j = 1; j < skill.length(); j++) {
				/* 4 */
				currentIdx = skill_trees[i].indexOf(skill.charAt(j));
				/* 5 */
				if((beforeIdx > currentIdx && currentIdx != -1) || (beforeIdx == -1 && currentIdx != -1)) {
					answer--;
					break;
				} 
				/* 6 */
				beforeIdx = currentIdx;
			}
		}

		return answer;
	}
}