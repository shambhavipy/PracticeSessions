package PracticeQuestions;

import java.util.Collections;
import java.util.Stack;

import static java.util.Collections.reverse;

public class ReverseWords {
    static String reverseWords(String s) {

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (!stack.isEmpty() && stack.peek() == '.' && s.charAt(i) != '.') {
                while (!stack.isEmpty()) {
                    if (stack.peek() != '.') {
                        sb.append(stack.pop());
                    } else {
                        stack.pop();
                    }
                }
                sb.append('.');
            }
            stack.push(s.charAt(i));
        }

        while (!stack.isEmpty()) {
            if (stack.peek() != '.') {
                sb.append(stack.pop());
            } else {
                stack.pop();
            }
        }

        if(sb.charAt(0)=='.') {
            sb.deleteCharAt(0);
        }
        if(sb.charAt(sb.length()-1)=='.') {
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.print(reverseWords(".i...like....you.."));
    }
}


