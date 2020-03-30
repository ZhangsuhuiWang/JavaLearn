package leetcode;


public class ShortestToChar {
    public static void main(String[] args) {
        String S = "aaba";
        char C = 'b';
        print(shortestToChar(S, C));
    }

    public static int[] shortestToChar(String S, char C) {
        int[] ans = new int[S.length()];
        int prev = Integer.MIN_VALUE / 2;
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == C)
                prev = i;
            ans[i] = i - prev;
        }
        System.out.println("step1: ");
        print(ans);
        int last = Integer.MAX_VALUE / 2;
        for(int i = S.length() - 1; i >= 0; i--) {
            if(S.charAt(i) == C) {
                last = i;
            }
            ans[i] = Math.min(last - i, ans[i]);
        }
        System.out.println("step2: ");
        print(ans);
        return ans;
    }

    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
