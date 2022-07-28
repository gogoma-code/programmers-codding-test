// 문자열 내 마음대로 정렬하기 :: https://gogoma.tistory.com/98
// https://school.programmers.co.kr/learn/courses/30/lessons/12915?language=java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class Solution {
	public List<Integer> sortByValue(final Map<Integer, Character> map) {
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(map.keySet());
		Collections.sort(list, new Comparator<Object>() {
			@SuppressWarnings("unchecked")
			public int compare(Object o1, Object o2) {
				Object v1 = map.get(o1);
				Object v2 = map.get(o2);
				return ((Comparable<Object>) v1).compareTo(v2);
			}
		});

		// Collections.reverse(list); // 주석시 오름차순
		return list;
	}

	public String[] solution(String[] strings, int n) {
		Arrays.sort(strings);
		String[] newStrings = new String[strings.length];

		Map<Integer, Character> map = new HashMap<Integer, Character>();
		for (int i = 0; i < strings.length; i++) {
			map.put(i, strings[i].charAt(n));
		}
		Iterator<Integer> it = sortByValue(map).iterator();

		for (int i = 0; it.hasNext(); i++) {
			newStrings[i] = strings[it.next()];
		}

		return newStrings;
	}

	public String[] solution2(String[] strings, int n) {
		String[] answer = strings;

		for (int i = 0; i < answer.length - 1; i++) {
			for (int j = i + 1; j < answer.length; j++) {
				if (answer[i].charAt(n) > answer[j].charAt(n)) {
					String tmp = answer[j];
					answer[j] = answer[i];
					answer[i] = tmp;
				} else if (answer[i].charAt(n) == answer[j].charAt(n) && answer[i].compareTo(answer[j]) > 0) {
					String tmp = answer[j];
					answer[j] = answer[i];
					answer[i] = tmp;
				}
			}
		}

		return answer;
	}

	public String[] solution3(String[] strings, int n) {
		Arrays.sort(strings, (s1, s2) -> {
			if (s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
			else return s1.charAt(n) - s2.charAt(n);
		});
		
		return strings;
	}
}