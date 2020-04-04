package leetcode;

import java.util.*;

public class WordPattern {
    public static boolean wordPattern(String pattern, String str) {
        String[] word = str.split(" ");
        if(pattern.length() != word.length) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++) {
            if(!map.containsKey(pattern.charAt(i)) && !map.containsValue(word[i])) {
                map.put(pattern.charAt(i), word[i]);
            } else if(!map.containsKey(pattern.charAt(i)) && map.containsValue(word[i])) {
                return false;
            } else {
                if (!map.get(pattern.charAt(i)).equals(word[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "dog dog dog dog";
        String pattern = "abba";
        System.out.println(wordPattern(pattern, str));
    }
}
