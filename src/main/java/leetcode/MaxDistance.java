package leetcode;

import java.util.*;

public class MaxDistance {
    public static int maxDistance(int[][] grid) {
        int N = grid.length;
        Queue<int[]> queue = new ArrayDeque<>();
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(grid[i][j] == 1) {
                    queue.add(new int[]{i, j});
                }
            }
        }
        if(queue.isEmpty() || queue.size() == N * N) {
            return -1;
        }
        int distantce = -1;
        while(!queue.isEmpty()){
            distantce++;;
            int length = queue.size();
            for(int i = 0; i < length; i++) {
                int c[] = queue.poll();
                int first = c[0];
                int last = c[1];
                //up
                if(first - 1 >= 0 && grid[first-1][last] == 0) {
                    grid[first-1][last] = 2;
                    queue.add(new int[]{first-1, last});
                }
                //down
                if(first + 1 < N && grid[first+1][last] == 0) {
                    grid[first+1][last] = 2;
                    queue.add(new int[]{first+1, last});
                }
                //left
                if(last - 1 >= 0 && grid[first][last-1] == 0) {
                    grid[first][last-1] = 2;
                    queue.add(new int[]{first, last-1});
                }
                //right
                if(last + 1 < N && grid[first][last+1] == 0) {
                    grid[first][last+1] = 2;
                    queue.add(new int[]{first, last+1});
                }
            }
        }

        return distantce;
    }

    public static void print(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] grid = {{1,0,1},{0,0,0},{1,0,1}};
        System.out.println(maxDistance(grid));
    }
}
