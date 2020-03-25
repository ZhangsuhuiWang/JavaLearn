package leetcode;

import java.util.*;

public class CompressString {
    public static void main(String[] args) {
        String S = "";
        String new_S = "";
        int count = 1;
        int i = 0;
        if (S == "") {
            new_S = S;
        } else {
            for(; i < S.length() - 1; i++) {
                if(S.charAt(i) == S.charAt(i+1)) {
                    count++;
                } else {
                    new_S += (S.charAt(i) + String.valueOf(count));
                    count = 1;
                }
            }
            System.out.println("i: " + i);
            new_S += (S.charAt(i) + String.valueOf(count));
        }
        if(new_S.length() < S.length()) {
        } else {
            new_S = S;
        }
        System.out.println(new_S);
    }
}
