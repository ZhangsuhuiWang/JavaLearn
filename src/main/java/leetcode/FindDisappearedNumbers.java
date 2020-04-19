package leetcode;

import java.util.*;

public class FindDisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            int newIndex = Math.abs(nums[i]) - 1;
            if(nums[newIndex] > 0) {
                nums[newIndex] *= -1;
            }
        }
        for(int i = 0; i <nums.length; i++) {
            if(nums[i] > 0) {
                ans.add(i+1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums).toString());
    }
}
