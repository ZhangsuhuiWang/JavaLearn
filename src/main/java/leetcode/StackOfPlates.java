package leetcode;


import java.util.*;

public class StackOfPlates {
    ArrayList<Stack<Integer>> arrayListStack;
    private int max;

    public StackOfPlates(int cap) {
        arrayListStack = new ArrayList<Stack<Integer>>();
        this.max = cap;
    }

    public void push(int val) {
        if(max != 0) {
            if(arrayListStack.get(arrayListStack.size()-1).size() == max || arrayListStack.size() == 0) {
                Stack new_stack = new Stack();
                new_stack.push(val);
                arrayListStack.add(new_stack);
            } else {
                arrayListStack.get(arrayListStack.size()-1).push(val);
            }
        }
    }

    public int pop() {
        if(arrayListStack.size() == 0) {
            return -1;
        }
        int value = arrayListStack.get(arrayListStack.size()-1).pop();
        if(arrayListStack.get(arrayListStack.size()-1).size() == 0) {
            arrayListStack.remove(arrayListStack.size()-1);
        }
        return value;
    }

    public int popAt(int index) {
        if(index >= arrayListStack.size() || arrayListStack.size() == 0) {
            return -1;
        }
        int value = arrayListStack.get(index).pop();
        if(arrayListStack.get(index).size() == 0) {
            arrayListStack.remove(index);
        }
        return value;
    }
}
