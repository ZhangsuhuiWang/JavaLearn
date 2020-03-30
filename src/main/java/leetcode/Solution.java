package leetcode;

import java.util.*;

public class Solution {
    public static List<Integer> generate(int rowIndex) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        list.add(Collections.singletonList(1));
        for(int i = 1; i <= rowIndex; i++) {
            List<Integer> sublist = new ArrayList<Integer>();
            sublist.add(1);
            for(int j = 1; j < i; j++) {
                sublist.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
            }
            sublist.add(1);
            list.add(sublist);
        }
        return list.get(rowIndex);
    }

    public static int numRookCaptures(String[][] board) {
        int init_x = 0, init_y = 0;
        int[] x = {0, 1, 0, -1};
        int[] y = {1, 0, -1, 0};
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if(board[i][j] == "R"){
                    init_x = i;
                    init_y = j;
                    break;
                }
            }
        }
        System.out.println("init_x: " + init_x + " init_y: " + init_y);
        int count = 0;
        for(int i = 0; i < 4; i++) {
            for(int step = 1;;step++) {
                int new_x = init_x + x[i] * step;
                int new_y = init_y + y[i] * step;
                System.out.println("new_x: " + new_x + " new_y: " + new_y);
                if(new_x < 0 || new_x >= 8 || new_y < 0 || new_y >= 8 || board[new_x][new_y] == "B") {
                    break;
                }
                if(board[new_x][new_y] == "p") {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[][] board = {{".",".",".",".",".",".",".","."},
                            {".",".",".","p",".",".",".","."},
                            {".",".",".","p",".",".",".","."},
                            {"p","p",".","R",".","p","B","."},
                            {".",".",".",".",".",".",".","."},
                            {".",".",".","B",".",".",".","."},
                            {".",".",".","p",".",".",".","."},
                            {".",".",".",".",".",".",".","."}};
        System.out.println("count: " + numRookCaptures(board));
    }
}
