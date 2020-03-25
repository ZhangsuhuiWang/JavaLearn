package chap11;

import mindview.util.Stack;

public class test15 {
    public static void main(String[] args) {
        Stack<Character> stacks = new Stack<Character>();
        for(Character c: "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---".toCharArray()) {
            if (c == '+') {
                stacks.push(c);
            }else if(c == '-') {
                stacks.pop();
            }
        }
        System.out.print(stacks);
    }
}
