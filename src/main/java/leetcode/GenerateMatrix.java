package leetcode;

public class GenerateMatrix {
    public static int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int num = 1;
        int top = 0, right = n-1, left = 0, down = n-1;
        while(num <= n*n) {
            for(int i = left; i <= right; i++)
                ans[left][i] = num++;
            top++;
            print(ans);
            System.out.println();
            for(int i = top; i <= down; i++)
                ans[i][right] = num++;
            right--;
            print(ans);
            System.out.println();
            for(int i = right; i >= left; i--)
                ans[down][i] = num++;
            down--;
            print(ans);
            System.out.println();
            for(int i = down; i >= top; i--)
                ans[i][left] = num++;
            left++;
            print(ans);
            System.out.println();
        }
        return ans;
    }

    public static void print(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        print(generateMatrix(n));
    }
}
