package leetcode;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                break;
            }
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int L = i + 1;
            int R = nums.length - 1;
            while(L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if(sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[L], nums[R]));
                    while(L < R && nums[L] == nums[L+1] ) {
                        L++;
                    }
                    while(L < R && nums[R] == nums[R-1]) {
                        R--;
                    }
                    L++;
                    R--;
                }else if(sum < 0) {
                    L++;
                }else {
                    R--;
                }

            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}
