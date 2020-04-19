package leetcode;

import java.util.*;

public class IsStraight {
    public static boolean isStraight(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] arr = new int[13];
        for(int i = 0; i < 5; i++) {
            if(nums[i] != 0) {
                if(arr[nums[i]-1] == 1) {
                    return false;
                } else {
                    arr[nums[i]-1] = 1;
                    min = Math.min(min, nums[i]);
                    max = Math.max(max, nums[i]);
                }
            }
        }
        return max - min <= 5;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,2,5};
        System.out.println(isStraight(nums));
    }
}
