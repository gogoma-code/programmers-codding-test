// 카펫
// https://school.programmers.co.kr/learn/courses/30/lessons/42842
class Solution {
    public int[] solution(int brown, int yellow) {
        int y = 3;
        int x = (brown + yellow) / y;

        while (x * y - brown != yellow) {
            x = (brown + yellow) / ++y;
        }

        return new int[] { x, y };
    }
}