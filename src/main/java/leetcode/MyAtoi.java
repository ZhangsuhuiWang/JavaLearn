package leetcode;

public class MyAtoi {
    public static int myAtoi(String str) {
        long ans = 0;
        int sign = 1;
        int max = 2147483647;
        int min = -2147483648;
        int i = 0;
        while(str.charAt(i) == ' ') {
            i++;
        }
        int c = str.charAt(i);
        if(c == '-') {
            sign = -1;
            i++;
        }
        if (c == '+') {
            i++;
        }
        while(i < str.length() && Character.isDigit(str.charAt(i))) {
            ans = ans * 10 + (int)(str.charAt(i) - '0');
            if(ans > max || ans < min)
                return ans > max ? max: min;
            i++;
        }
        return (int) ans * sign;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
    }
}
