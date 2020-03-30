package leetcode;

import java.util.*;

public class MinimumLengthEncoding {
    public static void main(String[] args) {
        String[] words = new String[]{"time", "time", "bell"};
        System.out.println(minimumLengthEncoding(words));
    }

    public static int minimumLengthEncoding(String[] words) {
        HashSet<String> hashSet = new HashSet<String>(Arrays.asList(words));
        for(String word: words) {
            for(int i = 1; i < word.length(); i++)
            hashSet.remove(word.substring(i));
        }
        System.out.println(hashSet);
        int ans = 0;
        for(String word: hashSet) {
                ans += word.length() + 1;
        }
        return ans;
    }
}
