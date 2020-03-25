package leetcode;

import java.util.*;

public class SetZeros {
    public static void main(String[] args) {
        int matrix[][]= {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
//        init(matrix);
        HashSet<Integer> s1 = new HashSet<Integer>();
        HashSet<Integer> s2 = new HashSet<Integer>();
        int count = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0) {
                    s1.add(i);
                    s2.add(j);
                }
            }
        }
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("Init");
        print(matrix);
        for(int i = 0; i < matrix.length; i++) {
            for(int j: s2) {
                matrix[i][j] = 0;
            }
        }
        System.out.println("step1:");
        print(matrix);
        for(int i: s1) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = 0;
            }
        }
        System.out.println("step2:");
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
                matrix[i][j] = new Random().nextInt(3);
            }
        }
    }
}
