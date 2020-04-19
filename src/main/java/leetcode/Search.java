package leetcode;

public class Search {
    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length;
        int count = 0;
        while(low < high) {
            int mid = (low + high) / 2;
            if(nums[mid] < target) {
                low = mid + 1;
            } else if(nums[mid] > target) {
                high = mid - 1;
            } else {
                for(int i = 1; ; i++) {

                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(search(nums, 8));
    }
}
