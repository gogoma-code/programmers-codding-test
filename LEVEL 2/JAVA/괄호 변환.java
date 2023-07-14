
// 괄호 변환
// https://school.programmers.co.kr/learn/courses/30/lessons/60058?language=java
import java.util.Stack;

class Solution {
    public String solution(String p) {
        return conversion(p);
    }

    public String conversion(String w) {
        if (w.equals(""))
            return "";

        String result = new String("");
        String u = new String("");
        int left = 0, right = 0;

        for (int i = 0; i < w.length(); i++) {
            String wSub = String.valueOf(w.charAt(i));
            u += wSub;
            if (wSub.equals("("))
                left++;
            else
                right++;

            if (left == right) {
                String v = w.substring(i + 1, w.length());
                if (isCorrect(u)) {
                    result += u + conversion(v);
                } else {
                    u = u.substring(1, u.length() - 1);
                    u = u.replaceAll("[(]", "#").replaceAll("[)]", "(").replaceAll("[#]", ")");
                    result += "(" + conversion(v) + ")" + u;
                }
                break;
            }
        }

        return result;
    }

    public boolean isCorrect(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if (bracket == '(') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) {
                    answer = false;
                    break;
                }
                stack.pop();
            }
        }

        return answer && stack.isEmpty();
    }
}