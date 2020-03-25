package leetcode;

import mindview.util.Stack;

import java.lang.reflect.Array;
import java.util.*;

public class Rotate {
    public static void main(String[] args) {
        ArrayList<Stack<Integer>> arr = new ArrayList<Stack<Integer>>();
        int matrix[][] = new int[5][5];
        int N = matrix.length;
        init(matrix);
        System.out.println("Init:");
        print(matrix);
        if(N % 2 != 0) {
            for(int i = 0; i < N/2 + 1; i++) {
                for(int j = 0; j < N/2; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[N-j-1][i];
                    matrix[N-j-1][i] = matrix[N-i-1][N-j-1];
                    matrix[N-i-1][N-j-1] = matrix[j][N-i-1];
                    matrix[j][N-i-1] = temp;
                }
            }
        } else {
            for(int i = 0; i < N/2; i++) {
                for(int j = 0; j < N/2; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[N-j-1][i];
                    matrix[N-j-1][i] = matrix[N-i-1][N-j-1];
                    matrix[N-i-1][N-j-1] = matrix[j][N-i-1];
                    matrix[j][N-i-1] = temp;
                }
            }
        }

        System.out.println("rotate:");
        print(matrix);
    }

    public static void print(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void init(int[][] matrix) {
        for(int i = 0;i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i * matrix.length + j;
            }
        }
    }
}
