package leetcode;

import java.util.*;

public class HasGroupsSizeX {
    public static void main(String[] args) {
        int[] deck = {1,1,1,2,2,2,3,3};
        System.out.println(hasGroupsSizeX(deck));
    }

    public static boolean hasGroupsSizeX(int[] deck) {
        int[] arr = new int[10000];
        for(int i = 0; i < deck.length; i++) {
            arr[deck[i]] += 1;
        }
        int g = -1;
        for(int i = 0; i < 10000; i++) {
            if(g == -1) {
                g = arr[i];
            }else {
                g = gcd(arr[i], g);
            }
        }
        return g >= 2;
    }

    public static int gcd(int x, int y) {
        if(y == 0) {
            return x;
        }
        return x % y == 0 ?  y : gcd(y, x%y);
    }
}
