package leetcode;

public class ReverseWords {
    public static String reverseWords(String s){
        String[] word = s.split("\\s+");
        String res = "";
        for(int i = 0; i < word.length; i++) {
            res += word[word.length - i - 1] + " ";
        }
        return res.trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Hello     world! "));
    }
}
