package leetcode;

import java.util.*;

public class numJewelsInStones {
    public static int numJewelsInStones(String J, String S) {
        Map<Character, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < S.length(); i++) {
            if(hashMap.containsKey(S.charAt(i))) {
                hashMap.put(S.charAt(i), hashMap.get(S.charAt(i)) + 1);
            } else {
                hashMap.put(S.charAt(i), 1);
            }
        }
        int ans = 0;
        for(int i = 0; i < J.length(); i++) {
            if(hashMap.containsKey(J.charAt(i))) {
                ans += hashMap.get(J.charAt(i));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String J = "aA", S = "aAAbbbb";
        System.out.println(numJewelsInStones(J, S));
    }
}
