package leetcode;

public class Add {
    public static int add(int a, int b) {
        int sum, carry;
        while(b != 0) {
            sum = a ^ b;
            carry = (a & b) << 1;
            System.out.println("sum: " + sum + " carry: " + carry);
            a = sum;
            b = carry;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(add(3,0));
    }
}
