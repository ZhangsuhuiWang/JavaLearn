package leetcode;

public class FindMin {
    public static int findMin(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        int ans = nums[0];
        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] > nums[i+1]) {
                ans = nums[i+1];
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(findMin(nums));
    }
}
