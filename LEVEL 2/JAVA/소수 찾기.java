// 소수 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/42839?language=java
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public int solution(String numbers) {
        Set<Integer> set = new HashSet<Integer>();
        permutation("", numbers, set);
        return set.stream().filter(e -> isPrime(e)).collect(Collectors.toSet()).size();
    }

    public void permutation(String prefix, String str, Set<Integer> set) {
        int n = str.length();
        if (!prefix.equals("")) {
            set.add(Integer.valueOf(prefix));
        }
        for (int i = 0; i < n; i++) {
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), set);
        }
    }

    public boolean isPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime && num > 1;
    }
}