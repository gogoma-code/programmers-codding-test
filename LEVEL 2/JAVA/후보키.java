// 후보키
// https://school.programmers.co.kr/learn/courses/30/lessons/42890
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    static Set<String> set;

    public int solution(String[][] relation) {
        int col = relation[0].length;
        boolean[] check = new boolean[col];
        List<Integer> picked = new ArrayList<>();

        set = new HashSet<>();
        for (int i = 1; i <= col; i++) {
            pick(relation, picked, check, i, 0);
        }

        return set.size();
    }

    public void pick(String[][] relation, List<Integer> picked, boolean[] check, int num, int i) {
        for (; i < relation[0].length; i++) {
            if (num <= picked.size())
                break;
            if (!check[i]) {
                check[i] = true;
                picked.add(i);
                pick(relation, picked, check, num, i + 1);
                picked.remove(picked.size() - 1);
                check[i] = false;
            }
        }

        if (picked.size() == num) {
            System.out.println(picked);
            Set<String> pickedSet = new HashSet<>();
            for (int j = 0; j < relation.length; j++) {
                String str = new String();
                for (int idx : picked) {
                    str += relation[j][idx];
                }
                pickedSet.add(str);
            }

            if (pickedSet.size() == relation.length) {
                String str = new String();
                for (int idx : picked) {
                    str += String.valueOf(idx);
                }

                boolean candidateFlag = true;
                for (String s : set) {
                    List<String> candiList1 = Arrays.asList(s.split(""));
                    List<String> candiList2 = picked.stream()
                            .map(p -> String.valueOf(p))
                            .collect(Collectors.toList());

                    if (candiList2.containsAll(candiList1)) {
                        candidateFlag = false;
                        break;
                    }
                }

                if (candidateFlag)
                    set.add(str);
            }
        }
    }
}