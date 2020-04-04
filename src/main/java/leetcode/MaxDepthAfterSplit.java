package leetcode;

public class MaxDepthAfterSplit {
    public static int[]  maxDepthAfterSplit(String seq) {
        int[] ans = new int[seq.length()];
        for(int i = 0; i < seq.length(); i++) {
            if(seq.charAt(i) == '(') {
                ans[i] = i % 2 == 0 ? 0 : 1;
            } else {
                ans[i] = i % 2 == 0 ? 1 : 0;
            }
        }
        return ans;
    }

    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String seq = "(()())";
        print(maxDepthAfterSplit(seq));
    }
}
