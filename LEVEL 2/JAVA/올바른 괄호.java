// 올바른 괄호
// https://school.programmers.co.kr/learn/courses/30/lessons/12909?language=java
import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0; i<s.length(); i++) {
            char bracket =  s.charAt(i);
            if(bracket == '(') {
                stack.push(bracket);
            } else {
                if(stack.isEmpty()) {
                    answer = false;
                    break;
                } 
                stack.pop();
            }
        }

        return answer && stack.isEmpty();
    }
}