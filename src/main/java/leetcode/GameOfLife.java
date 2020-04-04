package leetcode;

public class GameOfLife {
    public static void gameOfLife(int[][] board) {
        int line = board.length;
        int row = board[0].length;
        int copyBoard[][] = new int[line][row];
        for(int i = 0; i < line; i++) {
            for(int j = 0; j < row; j++) {
                copyBoard[i][j] = board[i][j];
            }
        }
        int[] direction = {-1, 0, 1};
        for(int i = 0; i < line; i++) {
            for(int j = 0; j < row; j++) {
                int numsOfCell = 0;
                for(int p = 0; p < 3; p++) {
                    for(int q = 0; q < 3; q++) {
                        int new_line = i + direction[p];
                        int new_row = j + direction[q];
                        if((new_line >= 0 && new_line < line) && (new_row >= 0 && new_row < row) && copyBoard[new_line][new_row] == 1) {
                            numsOfCell += 1;
                        }
                        if(direction[p] == 0 && direction[q] == 0 && copyBoard[new_line][new_row] == 1) {
                            numsOfCell -= 1;
                        }
                    }
                }
                /*
                1. 如果活细胞周围八个位置的活细胞数少于两个，则该位置活细胞死亡；
                2. 如果活细胞周围八个位置有两个或三个活细胞，则该位置活细胞仍然存活；
                3. 如果活细胞周围八个位置有超过三个活细胞，则该位置活细胞死亡；
                4. 如果死细胞周围正好有三个活细胞，则该位置死细胞复活；
                 */
                //1 & 3
                if(numsOfCell < 2 || numsOfCell > 3) {
                    board[i][j] = 0;
                }
                //2wordPattern
                if((numsOfCell == 2 || numsOfCell == 3) && board[i][j] == 1) {
                    board[i][j] = 1;
                }
                //4==
                if(numsOfCell == 3 && board[i][j] == 0) {
                    board[i][j] = 1;
                }
            }
        }
    }

    public static void print(int[][] board) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] board = {
                {0,1,0},
                {0,0,1},
                {1,1,1},
                {0,0,0}};
        System.out.println("init:");
        print(board);
        gameOfLife(board);
        System.out.println("gameOfLife:");
        print(board);
    }
}
