package leetcode;

public class CustomStack {
    private int[] stack;
    private int maxSize;
    private int size;

    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        this.maxSize = maxSize;
        this.size = 0;
    }

    public void push(int x) {
        if(size >= maxSize) {
            return;
        }
        for(int i = size-1; i > 0; i--) {
            stack[i] = stack[i-1];
        }
        stack[0] = x;
    }

    public int pop() {
        if(size == 0) {
            return -1;
        }
        int ans = stack[0];
        for(int i = 0; i < size-1; i++) {
            stack[i] = stack[i+1];
        }
        return ans;
    }

//    public void increment(int k, int val) {
//        for(int i = size-1; i > size > k ? size-k : 0;)
//    }
}
