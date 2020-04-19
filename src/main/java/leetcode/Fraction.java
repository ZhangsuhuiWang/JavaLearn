package leetcode;

import java.util.*;

public class Fraction {
    public static int[] fraction(int[] cont) {
        int len = cont.length;
        int a = 1, b = cont[len-1];
        if(len == 1) {
            return new int[]{a, b};
        }
        for(int i = len - 2; i >= 0; i--) {
            int temp = b;
            b = a + cont[i] * b;
            a = temp;
        }
        return new int[]{b, a};
    }

    public static void main(String[] args) {
        int[] cont = {3,2,0,2};
        System.out.println(Arrays.toString(fraction(cont)));
    }
}
