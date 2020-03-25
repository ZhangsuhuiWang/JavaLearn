package leetcode;

import java.util.*;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "pwwkew";
        HashSet<Character> hs = new HashSet<Character>();
        int res_length = 0;
        int i = 0, j = 0;
        while(j < s.length()) {
            if(!hs.contains(s.charAt(j))) {
                hs.add(s.charAt(j++));
                res_length = Math.max(res_length, j - i);
                System.out.println(hs);
            }else {
                hs.remove(s.charAt(i++));
            }
        }
        System.out.println("----Result----");
        System.out.println("subString: " + hs + "\nres_length: " + res_length);
    }
}
