package leetcode;

public class RomanToInt {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int num = 0;
        for(int i = 0; i < s.length()-1;) {
            int preValue = value(s.charAt(i));
            System.out.println("preValue: " + preValue);
            if(preValue < value(s.charAt(++i))) {
                num -= preValue;
                System.out.println("num: " + num);
            } else {
                num += preValue;
            }
        }
        num+=value(s.charAt(s.length()-1));
        System.out.println(s + "----" + num);
    }

    /*
    字符          数值
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
     */
    public static int value(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
