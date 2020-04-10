package leetcode;

public class ReverseLeftWords {
    public static String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }

    public static void main(String[] args) {
        System.out.println(reverseLeftWords("lrloseumgh", 6));
    }
}
