package leetcode;

public class Multiply {
    public static int multiply(int A, int B) {
        int C = A;
        while(B > 1) {
            A = A << 1;
            B = B / 2;
            System.out.println("A: " + A + " B: " + B);
        }
        if(B != 0) {
            A += C;
        }
        return A;
    }

    public static void main(String[] args) {
        System.out.println(multiply(3, 4));
    }
}
