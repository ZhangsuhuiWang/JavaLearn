package leetcode;

public class SurfaceArea {
    public static void main(String[] args) {
        //[[2,2,2],[2,1,2],[2,2,2]]
        int[][] grid = {{2, 2, 2}, {2, 1, 2}, {2, 2, 2}};
        System.out.println(surfaceArea(grid));
    }

    public static int surfaceArea(int[][] grid) {
        int sum = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] != 0) {
                    sum += (6 * grid[i][j] - innerArea(grid[i][j]));
                }
                if((j+1) != grid[i].length && grid[i][j] != 0 && grid[i][j+1] != 0) {
                    sum -= outerArea(Math.min(grid[i][j], grid[i][j+1]));
                }
                if((i+1)!= grid.length && grid[i][j] != 0 && grid[i+1][j] != 0) {
                    sum -= outerArea(Math.min(grid[i][j], grid[i+1][j]));
                }
            }
        }
        return sum;
    }

    public static int innerArea(int num) {
        return num != 0 ? 2*(num-1) : 0;
    }

    public static int outerArea(int num) {
        return 2 * num;
    }
}
