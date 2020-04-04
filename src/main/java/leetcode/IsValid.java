package leetcode;

import java.util.*;

public class IsValid {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean flag = true;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
//                System.out.println(4);
                stack.push(s.charAt(i));
            } else if(s.charAt(i) == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                } else {
                    System.out.println(1);
                    stack.pop();
                }
            } else if (s.charAt(i) == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    return false;
                } else {
                    stack.pop();
                    System.out.println(2);
                }
            } else {
                if (stack.isEmpty() || stack.peek() != '{') {
                    return false;
                } else {
                    stack.pop();
                    System.out.println(3);
                }
            }
        }
        return stack.isEmpty() && flag;
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

}
