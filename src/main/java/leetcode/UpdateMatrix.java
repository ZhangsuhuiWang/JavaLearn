package leetcode;

import java.util.*;

public class UpdateMatrix {
    public static int[][] updateMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] ans = new int[m][n];
        boolean[][] visited = new boolean[m][n];
        int[] x = {1, 0, -1, 0};
        int[] y = {0, 1, 0, -1};
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    ans[i][j] = 0;
                    visited[i][j] = true;
                    queue.offer(new int[]{i, j});
                }
            }
        }
        while(!queue.isEmpty()) {
            int[] temp = queue.poll();
            for(int i = 0; i < 4; i++) {
                int new_x = temp[0] + x[i];
                int new_y = temp[1] + y[i];
                if(new_x >= 0 && new_x < m && new_y >= 0 && new_y < n && !visited[new_x][new_y]) {
                    ans[new_x][new_y] = ans[temp[0]][temp[1]] + 1;
                    visited[new_x][new_y] = true;
                    queue.offer(new int[]{new_x, new_y});
                }
            }
        }
        return ans;
    }

    public static void print(int[][] nums) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{0,0,0},{0,1,0},{1,1,1}};
        print(updateMatrix(matrix));
    }
}

