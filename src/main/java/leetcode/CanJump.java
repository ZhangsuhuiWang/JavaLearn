package leetcode;

public class CanJump {
    public static boolean canJump(int[] nums) {
        int len = nums.length;
        int max = 0;
        for(int i = 0; i < len; i++) {
            if(i <= max) {
                max = Math.max(max, nums[i] + i);
                System.out.print(max + " ");
                if(max > len - 1)
                    return true;
            }
        }
        System.out.println();
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        System.out.println(canJump(nums));
    }
}
