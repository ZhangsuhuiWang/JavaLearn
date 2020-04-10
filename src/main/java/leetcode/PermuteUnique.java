package leetcode;

import java.util.*;

public class PermuteUnique {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        int[] visited = new int[nums.length];
        backTrack(nums, visited, ans, new ArrayList<Integer>());
        List<List<Integer>> res = new ArrayList<>();
        Iterator it = ans.iterator();
        while (it.hasNext()) {
            List<Integer> list = (ArrayList)it.next();
            res.add(list);
        }
        return res;
    }

    public static void backTrack(int[] nums, int[] visted, Set<List<Integer>> ans, ArrayList<Integer> temp) {
        if(temp.size() == nums.length) {
            ans.add(temp);
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(visted[i] == 1) {
                continue;
            }
            visted[i] = 1;
            temp.add(nums[i]);
            backTrack(nums, visted, ans, temp);
            visted[i] = 0;
            temp.remove(temp.size() - 1);
         }
    }

    public static void main(String[] args) {
        int[] nums= {1,1,2};
        System.out.println(nums);
    }


}
