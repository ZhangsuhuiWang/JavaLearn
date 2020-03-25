package leetcode;

public class IsFlipedString {
    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        boolean flag = false;
        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) == s2.charAt(0)) {
                String new_s1 = s1.substring(i) + s1.substring(0, i);
                for(int j = 0; j < s2.length(); j++) {
//                    System.out.println(new_s1);
//                    System.out.println((char) new_s1.charAt(j) + "-" + (char)s2.charAt(j));
                }
                flag |= new_s1.equals(s2);
                System.out.println(flag + "-" + new_s1 + "-" + s2 + "-" + (flag |= new_s1==s2));
            }
        }
        System.out.println(flag);
    }
}
