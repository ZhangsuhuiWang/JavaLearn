package leetcode;

import java.util.*;

public class Permute {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] visited = new int[nums.length];
        backTrack(nums, visited, new ArrayList<>(), ans);
        return ans;
    }

    public static void backTrack(int[] nums, int[] visted, List<Integer> temp,List<List<Integer>> ans) {
        if(temp.size() == nums.length) {
            ans.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(visted[i] == 1) {
                continue;
            }
            visted[i] = 1;
            temp.add(nums[i]);
            backTrack(nums, visted, temp, ans);
            visted[i] = 0;
            temp.remove(temp.size() -1);
        }

    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(nums);
    }
}
