package leetcode;

public class Trap {
    public static int trap(int[] height) {
        if(height.length == 0) {
            return 0;
        }
        int[] Lmax = new int[height.length];
        int[] Rmax = new int[height.length];
        Lmax[0] = height[0];
        Rmax[height.length-1] = height[height.length-1];
        for(int i = 1; i < height.length; i++) {
            Lmax[i] = Math.max(height[i], Lmax[i-1]);
        }
        System.out.print("min:");
        print(Lmax);
        for(int i = height.length - 2; i >= 0; i--) {
            Rmax[i] = Math.max(height[i], Rmax[i+1]);
        }
        System.out.print("max:");
        print(Rmax);
        int[] max = new int[height.length];
        for(int i = 1; i < height.length; i++) {
            max[i] = Math.min(Lmax[i], Rmax[i]);
        }
        int ans = 0;
        for(int i = 1; i < height.length; i++) {
            ans += max[i] - height[i];
        }

        return ans;
    }

    public static void print(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
