package leetcode;
import mindview.util.Utils;


public class Massage {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(massage(nums));
    }


    public static int massage(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return nums[0];
        }
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = nums[1];
        for(int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]);
        }
        Utils.print(dp);
        return dp[n-1];
    }

}
