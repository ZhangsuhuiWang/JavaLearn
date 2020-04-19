package leetcode;

public class SearchMatrix {
    public static boolean searchMatrix(int[][] nums, int target) {
        int m = nums.length-1;
        int n = nums[0].length;
        int i = 0;
        while(m >= 0 && i < n) {
            if(nums[m][i] > target) {
                m--;
            } else if(nums[m][i] < target) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] nums = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        System.out.println(searchMatrix(nums, 17));
    }
}
