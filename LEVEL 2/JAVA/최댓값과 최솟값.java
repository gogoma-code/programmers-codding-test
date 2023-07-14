// 최댓값과 최솟값
// https://school.programmers.co.kr/learn/courses/30/lessons/12939
import java.util.Arrays;

class Solution {
    public String solution2(String s) {
        String[] sArr = s.split(" ");
        int[] iArr = new int[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            iArr[i] = Integer.parseInt(sArr[i]);
        }

        Arrays.sort(iArr);

        return iArr[0] + " " + iArr[iArr.length - 1];
    }
}