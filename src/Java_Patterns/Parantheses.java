package Java_Patterns;

import java.util.Stack;

public class Parantheses {
    public static void main(String[] args) {
        int res = minParentheses(")(()())))))");
        System.out.println(res);
    }

    public static int minParentheses(String pattern) {
        Stack<Character> stack = new Stack<Character>();
        int count = 0;

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    count++;
                }
            }
        }

        return count + stack.size();
    }

}
