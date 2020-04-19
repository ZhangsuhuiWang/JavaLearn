package leetcode;

public class TrailingZeroes {
    public static int trailingZeroes(int n) {
        int numsOfFive = 0;
        while(n > 0) {
            numsOfFive += n / 5;
            n /= 5;
        }
        return numsOfFive;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(30));
    }
}
