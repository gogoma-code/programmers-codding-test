// [3차] 파일명 정렬
// https://school.programmers.co.kr/learn/courses/30/lessons/17686
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public String[] solution(String[] files) {		
		Pattern pattern = Pattern.compile("([a-zA-Z\\.\\- ]+)([0-9]{1,5})");
		
		Arrays.sort(files, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				Matcher m1 = pattern.matcher(o1);
				Matcher m2 = pattern.matcher(o2);
				m1.find();
				m2.find();
				
				String head1 = m1.group(1), head2 = m2.group(1);
				int result = head1.toLowerCase().compareTo(head2.toLowerCase());
				if(result == 0) {
					result = Integer.parseInt(m1.group(2)) - Integer.parseInt(m2.group(2));	
				}
				
				return result;
			}
		});
		
        return files;
    }
}