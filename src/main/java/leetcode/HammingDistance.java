package leetcode;

public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public static void main(String[] args) {

    }
}
