package leetcode;

import mindview.util.Stack;

public class isUnique {
    public static void main(String[] args) {
        String astr1 = "jzvthzihsvghjhbrpfhdwixmyaxjrdzfvnhpmyrbqjpdffykqgahgzpjwvouurr";
        String astr2 = "hhqhxjyrghjjsmduaxppwrqkikqnfdrzjowapehtbyrgrfyprrfrebzduxvvhhu";
        Stack<Integer> stack = new Stack<>();
        boolean flag = true;
        int[] intArray1 = new int[26];
        int[] intArray2 = new int[26];
        for(int i = 0; i < 26 ; i++) {
            intArray1[i] = 0;
            intArray2[i] = 0;
        }
        for(int i = 0; i < astr1.length(); i++) {
            intArray1[(int)astr1.charAt(i) - 'a']++;
        }
        for(int i = 0; i < astr2.length(); i++) {
            intArray2[(int)astr2.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if(intArray1[i] != intArray2[i]) {
                flag = false;
            }
        }
        System.out.println(flag);




    }
}
