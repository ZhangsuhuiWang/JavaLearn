package leetcode;


import java.util.*;

public class LeetcodeTest {
    public static void main(String[] args) {
        boolean flag = true;
        String first = "teacher";
        String second =  "bleacher";
        ArrayList<Character> arr1 = new ArrayList<Character>();
        ArrayList<Character> arr2 = new ArrayList<Character>();
        for(int i = 0; i < first.length(); i++) {
            arr1.add(first.charAt(i));
        }
        for(int i = 0; i < second.length(); i++) {
            arr2.add(second.charAt(i));
        }
        System.out.println("arr1.size: " + arr1.size() + " arr2.size: " + arr2.size());
        int diff = 0;
        if(arr1.size() == arr2.size()) {
            for(int i = 0; i < arr1.size(); i++) {
                if(arr1.get(i) != arr2.get(i)) {
                    diff++;
                    if(diff > 1) {
                        flag = false;
                    }
                }
            }
        } else if(Math.abs(arr1.size() - arr2.size()) > 1) {
            flag = false;
        } else {
            for(int i = 0, j = 0; i < arr1.size() && j <  arr2.size(); ) {
                if(arr1.get(i) != arr2.get(j)) {
                    diff++;
                    if (diff > 1)
                        flag = false;
                    if(arr1.size() > arr2.size()) {
                        i++;
                    } else {
                        j++;
                    }
                } else {
                    i++;
                    j++;
                }
            }
        }
        System.out.println(flag);
    }
}
