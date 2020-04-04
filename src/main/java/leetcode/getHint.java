package leetcode;

import java.util.*;

public class getHint {
    public static String getHint(String secret, String guess) {
       int right = 0;
       int not_right = 0;
       int a[] = new int[10];
       int b[] = new int[10];
       for(int i = 0; i <  10; i++) {
           a[i] = 0;
           b[i] = 0;
       }
       for(int i = 0; i < secret.length(); i++) {
           if(secret.charAt(i) == guess.charAt(i)) {
               right++;
           } else {
               a[secret.charAt(i) - '0']++;
               b[guess.charAt(i) - '0']++;
           }
       }
       for(int i = 0; i < 10; i++) {
           not_right += Math.min(a[i], b[i]);
       }
        String ans = right + "A" + not_right + "B";
        return ans;
    }

    public static void main(String[] args) {
        String secret = "1123";
        String guess =  "0111";
        System.out.println(getHint(secret, guess));
    }
}
