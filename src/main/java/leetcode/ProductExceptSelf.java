package leetcode;

import java.util.*;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int m = nums.length;
        int[] left = new int[m];
        int[] right = new int[m];
        left[0] = 1;
        right[m-1] = 1;
        for(int i = 1; i < m; i++) {
            left[i] = left[i-1] * nums[i-1];
        }
        System.out.println(Arrays.toString(left));
        for(int i = m - 2; i >= 0; i--) {
            right[i] = right[i+1] * nums[i+1];
        }
        System.out.println(Arrays.toString(right));
        for(int i = 0; i < m-1; i++) {
            right[i] *= left[i];
        }
        return right;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
