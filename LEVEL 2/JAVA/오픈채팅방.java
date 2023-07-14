// 오픈채팅방
// https://school.programmers.co.kr/learn/courses/30/lessons/42888?language=java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<String, String>();
        for (int i = record.length - 1; i >= 0; i--) {
            String[] splitData = record[i].split(" ");
            if (splitData[0].equals("Enter") || splitData[0].equals("Change")) {
                if (map.isEmpty() || !map.containsKey(splitData[1])) {
                    map.put(splitData[1], splitData[2]);
                }
            }
        }

        List<String> list = new ArrayList<String>();
        for (int i = 0; i < record.length; i++) {
            String[] splitData = record[i].split(" ");
            if (splitData[0].equals("Enter")) {
                list.add(map.get(splitData[1]) + "님이 들어왔습니다.");
            } else if (splitData[0].equals("Leave")) {
                list.add(map.get(splitData[1]) + "님이 나갔습니다.");
            }
        }

        String[] answer = list.toArray(new String[list.size()]);

        return answer;
    }
}