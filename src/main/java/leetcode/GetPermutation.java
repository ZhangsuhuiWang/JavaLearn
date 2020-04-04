package leetcode;

import java.util.*;

public class GetPermutation {
    public static String getPermutation(int n, int m) {
        int[] index = new int[n];
        ArrayList<Integer> arrayList = new ArrayList<>();
        index[0] = 1;
        arrayList.add(1);
        for(int i = 1; i < n; i++) {
            index[i] = index[i-1] * i;
            arrayList.add(i+1);
        }
        String ans = "";
        m--;
        print(index);
        for(int i = n-1; i >= 0; i--) {
            int idx = m / index[i];
            m = m % index[i];
            System.out.println("m: " + m);
            ans += String.valueOf(arrayList.get(idx));
            arrayList.remove(idx);
        }
        return ans;
    }

    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println(getPermutation(4, 9));
    }
}
