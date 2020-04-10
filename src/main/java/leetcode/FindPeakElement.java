package leetcode;

public class FindPeakElement {
    public static int findPeakElement(int[] nums) {
        int[] new_nums = new int[nums.length+2];
        new_nums[0] = Integer.MIN_VALUE;
        new_nums[new_nums.length-1] = Integer.MIN_VALUE;
        for(int i = 1; i < new_nums.length-1; i++) {
            new_nums[i] = nums[i-1];
        }
        for(int i = 0; i < new_nums.length; i++) {
            System.out.print(new_nums[i] + " ");
        }
        System.out.println();
        for(int i = 1; i < new_nums.length-1; i++) {
            if(new_nums[i] > new_nums[i-1] && new_nums[i] > new_nums[i+1]) {
                return i-1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {2,1};
        System.out.println(findPeakElement(nums));
    }
}
