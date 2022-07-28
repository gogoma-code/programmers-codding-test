// 폰켓몬 :: https://gogoma.tistory.com/109
// https://school.programmers.co.kr/learn/courses/30/lessons/1845?language=java
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] nums) {
        return Math.min(nums.length / 2, IntStream.of(nums).boxed().collect(Collectors.toSet()).size());
    }

    public int solution2(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }

        return Math.min(nums.length / 2, set.size());
    }
}