package leetcode;

import java.util.*;

public class MaxSlidingWindow {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        int[] ans = new int[len - k + 1];
        int max = Integer.MIN_VALUE;
        for(int i = k; i <= nums.length; i++) {
            ans[i-k] = max(nums, i-k, i-1);
        }
        return ans;
    }

    public static int max(int[] nums, int start, int end) {
        int ans = Integer.MIN_VALUE;
        for(int i = start; i <= end; i++) {
            ans = Math.max(ans, nums[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(nums, 3)));
    }
}
