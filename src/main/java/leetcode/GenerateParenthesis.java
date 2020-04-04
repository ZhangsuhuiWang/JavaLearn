package leetcode;

import java.util.*;

public class GenerateParenthesis {
    public static List generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        subGenerateParenthesis(list, "", 0, 0, n);
        return list;
    }

    public static void subGenerateParenthesis(List<String> list, String cur, int left, int right, int max) {
        if(cur.length() == max * 2) {
            list.add(cur);
            return;
        }
        if(left < max) {
            subGenerateParenthesis(list, cur + "(" , left + 1, right, max);
        }
        if(right < left) {
            subGenerateParenthesis(list, cur + ")" , left, right + 1, max);
        }

    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
        int sum = 0;
        for(int i = 1; i <= 20; i++) {
            sum += i*i;
        }
        System.out.println(sum);
    }
}
