package leetcode;

import java.util.*;

public class Solution {
    public static List<Integer> generate(int rowIndex) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        list.add(Collections.singletonList(1));
        for(int i = 1; i <= rowIndex; i++) {
            List<Integer> sublist = new ArrayList<Integer>();
            sublist.add(1);
            for(int j = 1; j < i; j++) {
                sublist.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
            }
            sublist.add(1);
            list.add(sublist);
        }
        return list.get(rowIndex);
    }

    public static void main(String[] args) {
        System.out.println(generate(33));
    }
}
