package leetcode;

import java.util.*;

public class TwoSum_2 {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int start = 0, end = nums.length-1;
        while(start < end) {
            int sum = nums[start] + nums[end];
            if(sum < target) {
                start++;
            } else if(sum > target){
                end--;
            } else {
                return new int[]{nums[start], nums[end]};
            }
        }
        return new int[]{};
    }
}
