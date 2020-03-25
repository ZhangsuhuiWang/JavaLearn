package leetcode;

import java.util.*;

public class GetLeastNumbers {
    public static void main(String[] args) {
        int k = 3;
        int arr[] = {3, 9, 8, 11, 12, 13, 14, 15, 6, 3};
//        for(int i = 0; i < arr.length-1; i++) {
//            for(int j = i + 1; j < arr.length; j++) {
//                if(arr[j] < arr[i]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] =temp;
//                }
//            }
//        }
        q_sort(arr, 0, 9);
        print(arr);
        System.out.println();
        int res[] = new int[k];
        for(int i = 0; i < k; i++) {
            res[i] = arr[i];
        }
        print(res);
    }

    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void q_sort(int[] arr, int start, int end) {
        if(start < end) {
            int flag = arr[start];
            int i = start, j = end;
            while(i < j) {
                while(arr[j] >= flag && j > i) {
                    j--;
                }
                if(i < j) {
                    arr[i] = arr[j];
                    i++;
                }
                while(arr[i] < flag && i < j) {
                    i++;
                }
                if(i < j) {
                    arr[j] = arr[i];
                    j--;
                }
            }
            arr[i] = flag;
            q_sort(arr, start, i-1);
            q_sort(arr, i+1, end);
        }
    }
}
