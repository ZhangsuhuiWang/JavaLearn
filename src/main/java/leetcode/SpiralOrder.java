package leetcode;

import java.util.*;

public class SpiralOrder {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int top = 0, down = matrix.length, right = matrix[0].length, left = 0;
        int count = 0;
        int sum = down * right;
        List<Integer> ans = new ArrayList<>();
        while(count < sum) {
            System.out.println(count + " " + sum);
            for(int i = left; i < right; i++) {
                ans.add(matrix[top][i]);
                count++;
            }
//            System.out.println(ans.toString());
            top++;
            if(count == sum) {
                break;
            }
//            System.out.println("right: " + right + " left:  " + left + " top:  " + top + " down: " + down);
            for(int i = top; i < down; i++) {
                ans.add(matrix[i][right-1]);
                count++;
            }
            right--;
            if(count == sum) {
                break;
            }
//            System.out.println(ans.toString());
//            System.out.println("right: " + right + " left:  " + left + " top:  " + top + " down: " + down);
            for(int i = right-1; i >= left; i--) {
                ans.add(matrix[down-1][i]);
                count++;
            }
            down--;
            if(count == sum) {
                break;
            }
//            System.out.println(ans.toString());
//            System.out.println("right: " + right + " left:  " + left + " top:  " + top + " down: " + down);
            for(int i = down-1; i >= top; i--) {
                ans.add(matrix[i][left]);
                count++;
            }
//            System.out.println(ans.toString());
            left++;
            if(count == sum) {
                break;
            }
//            System.out.println("right: " + right + " left:  " + left + " top:  " + top + " down: " + down);
        }
        int[][] res = new int[matrix.length][matrix[0].length];
        count = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                res[i][j] = ans.get(count++);
            }
        }
        System.out.println(ans.get(5));
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> ans = spiralOrder(matrix);
        System.out.println(ans.toString());
    }

}
