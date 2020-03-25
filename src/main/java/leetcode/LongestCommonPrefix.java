package leetcode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String prefix = commonPrefix(strs[0], strs[1]);
        for(int i = 1; i < strs.length; i++) {
            prefix = commonPrefix(prefix, strs[i]);
            System.out.println(prefix);
        }
    }

    public static String commonPrefix(String s1, String s2) {
        String s = "";
        for(int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            if(s1.charAt(i) == s2.charAt(i)) {
                s += s1.charAt(i);
            }
        }
        return s;
    }
}
