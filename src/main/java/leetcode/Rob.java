package leetcode;

import java.util.*;

public class Rob {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(rob(nums));
    }


    public static int rob(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return nums[0];
        }
        return Math.max(eachRob(Arrays.copyOfRange(nums, 0, nums.length-1)),
                eachRob(Arrays.copyOfRange(nums, 1, nums.length)));
    }

    public static int eachRob(int[] nums) {
        int cur = 0, pre = 0;
        System.out.println(nums.length);
        for(int i = 0; i < nums.length; i++) {
            int max = Math.max(nums[i] + pre , cur);
            pre = cur;
            cur = max;
            System.out.println("cur: " + cur + " pre: " + pre);
        }
        return cur;
    }
}
