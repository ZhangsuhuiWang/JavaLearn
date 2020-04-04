package leetcode;

import java.util.*;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < nums.length; i++) {
            int L = i + 1;
            int R = nums.length - 1;
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if(Math.abs(target - sum) < Math.abs(target - ans)) {
                    ans = sum;
                }
                if(sum < target) {
                    L++;
                } else if(sum > target) {
                    R--;
                } else {
                    return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
}
