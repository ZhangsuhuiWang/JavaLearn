package leetcode;

class isPalindrome {
    public static boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        else if(x == 0)
            return true;
        else {
            int result = 0;
            int y = x;
            while(x / 10.0 > 0) {
                result *= 10;
                int a = x % 10;
                int b = (x - a) / 10;
                x = b;
                result += a;
                System.out.println("a=" + a + ",b=" + b + ",x=" + x + ",result=" + result);
            }
            System.out.println("result=" + result + ",x=" + x);
            if(result == y)
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args) {
        int x = 123321;
        boolean flag = isPalindrome(x);
        System.out.println(flag);
    }
}
