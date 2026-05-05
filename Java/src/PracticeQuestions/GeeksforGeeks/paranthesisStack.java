package PracticeQuestions.GeeksforGeeks;

import java.util.Stack;


public class paranthesisStack {
    public static boolean isBalanced(String s) {
        // code here
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else if (c == ']' || c == '}' || c == ')') {
                if(stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if (c == ']' && top != '[' ||
                        c == ')' && top != '(' ||
                        c == '}' && top != '{') {
                    return false;
                }
                stack.pop();
            }

        }
        return stack.isEmpty();
    }


public static void main(String[] args) {
    String s = "{[(";
    System.out.println(paranthesisStack.isBalanced(s));
}
}

