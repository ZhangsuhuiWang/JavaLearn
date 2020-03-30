package leetcode;

import java.util.*;

public class LastRemaining {
    public static int lastRemaining(int n, int m) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0 ; i < n; i++) {
            arrayList.add(i);
        }
        int index = 0;
        while(n > 1) {
            index = (index+m-1) % n ;
            arrayList.remove(index);
            n--;
        }
        return arrayList.get(0);
    }

    public static void main(String[] args) {
        System.out.println(lastRemaining(5,3));
    }
}
