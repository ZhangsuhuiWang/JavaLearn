package leetcode;

import java.util.*;

public class FirstUniqChar {
    public static char firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                int count = s.charAt(i) + 1;
                map.remove(s.charAt(i));
                map.put(s.charAt(i), count);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
}
