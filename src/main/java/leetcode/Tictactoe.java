package leetcode;

public class Tictactoe {
    public static String tictactoe(String[] board) {
        int len = board.length;
        int[] x_row = new int[len];
        int[] x_line = new int[len];
        int[] o_row = new int[len];
        int[] o_line = new int[len];
        int x_left = 0, x_right = 0, o_left = 0, o_right = 0, size = 0;
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(board[i].charAt(j) == 'X') {
                    x_row[i]++;
                    x_line[j]++;
                    size++;
                    if(i == j) {
                        x_left++;
                    }
                    if(i + j == len - 1) {
                        x_right++;
                    }
                }
                if(board[i].charAt(j) == 'O') {
                    o_row[i]++;
                    o_line[j]++;
                    size++;
                    if(i == j) {
                        o_left++;
                    }
                    if(i + j == len - 1) {
                        o_right++;
                    }
                }
            }
        }
        if(x_left == len || x_right == len) {
            return "X";
        }
        if(o_left == len || o_right == len) {
            return "O";
        }
        for(int i = 0; i < len; i++) {
            if(x_row[i] == len || x_line[i] == len) {
                return "X";
            }
            if(o_row[i] == len || o_line[i] == len) {
                return "O";
            }
        }
        if(size < len * len) {
            return "Pending";
        }
        return "Draw";
    }

    public static void main(String[] args) {
        String[] board = {"O X"," XO","X O"};
        System.out.println(tictactoe(board));
    }
}
