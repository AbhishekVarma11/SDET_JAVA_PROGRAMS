package SDET_Java_Programs;

import java.util.Stack;

public class CheckingBalancedParathensis {
    public static void main(String args[]) {
        System.out.println(isBalanced("(([]))"));          // Output: true
        System.out.println(isBalanced("()[]{}"));      // Output: true
        System.out.println(isBalanced("(]"));          // Output: false
        System.out.println(isBalanced("([)]"));        // Output: false
        System.out.println(isBalanced("{[]}"));        // Output: true
    }

    private static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (Character ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}
