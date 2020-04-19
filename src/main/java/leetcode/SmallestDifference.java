package leetcode;

import java.util.*;

public class SmallestDifference {
    public static int smallestDifference(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int a_len = a.length;
        int b_len = b.length;
        long smallest = Integer.MAX_VALUE;
        for(int i = 0, j = 0; i < a_len && j < b_len;) {
            smallest = Math.min(Math.abs((long)a[i] - b[j]), smallest);
//            System.out.println(smallest);
            if(a[i] > b[j]) {
                j++;
            } else if(a[i] < b[j]) {
                i++;
            } else {
                return 0;
            }
        }
        return (int) smallest;
    }

    public static void main(String[] args) {
        int[] a = {-2147483648,1};
        int[] b = {2147483647,0};
        System.out.println(smallestDifference(a, b));
    }
}
