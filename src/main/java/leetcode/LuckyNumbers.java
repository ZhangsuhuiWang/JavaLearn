package leetcode;

import java.util.*;

public class LuckyNumbers {
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++) {
            int col = getMin(matrix[i]);
            if(colMax(matrix, i, col)) {
                list.add(matrix[i][col]);
            }
        }
        return list;
    }

    public static int getMin(int[] nums) {
        int index = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[index] > nums[i]) {
                index = i;
            }
        }
        return index;
    }

    public static boolean colMax(int[][] matrix, int row, int col) {
        boolean flag = true;
        for(int i = 0; i < matrix.length; i++) {
            if(matrix[i][col] > matrix[row][col]) {
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(matrix));
    }
}
