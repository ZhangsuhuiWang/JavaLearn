package leetcode;

public class MovingCount {
    public static int movingCount(int m, int n, int k) {
        int count = 1;
        int[][] visted = new int[m][n];
        visted[0][0] = 1;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(calculate(i) + calculate(j) <= k && (
                        (i - 1 >= 0 && visted[i-1][j] == 1) ||
                                (j - 1 >= 0 && visted[i][j-1] == 1) ||
                                (i + 1 < m && visted[i+1][j] == 1) ||
                                (j + 1 < n && visted[i][j+1] == 1 ))) {
                    count++;
                    visted[i][j] = 1;
                }
            }
        }
        return count;

    }

    public static int calculate(int m) {
        int sum = 0;
        while(m != 0) {
            sum += m % 10;
            m /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(movingCount(38,15,9));
    }
}
