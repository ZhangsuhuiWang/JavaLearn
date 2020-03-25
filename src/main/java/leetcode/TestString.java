package leetcode;

public class TestString {
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        System.out.println("maxSubString: " + maxSubstring(str));
    }

    public static String maxSubstring(String[] str) {
        if(str.length == 0){
            return "";
        }
        String ans = str[0];
        System.out.println("ans: " + ans);
        for(int i = 0; i < str.length - 1; i++) {
            int j = 0;
            for(; j < Math.min(str[i].length(), str[i+1].length()) && j < ans.length(); j++) {
                if(str[i].charAt(j) != str[i+1].charAt(j)) {
                    break;
                }
            }
            ans = str[i].substring(0, j);
            System.out.println("ans: " + ans);
        }
        return ans;
    }
}
