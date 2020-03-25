package leetcode;

import java.util.*;

/*
*
*   I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000

* */

public class IntToRoman {
    public static void main(String[] args) {
        int num = 1994;
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "X", "IX", "V", "IV", "I"};
        String res = "";
        for(int i = 0; i < nums.length; i++) {
            while(num >= nums[i]) {
                res += roman[i];
                num -= nums[i];
            }
        }
        System.out.println(res);
    }
}
