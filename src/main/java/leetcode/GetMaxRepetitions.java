package leetcode;

public class GetMaxRepetitions {
    public static int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        int s2_cnt = 0;
        int index = 0;
        for(int i = 0; i < n1; i++) {
            for(int j = 0; j < arr1.length; j++) {
                System.out.println(j + " " + index);
                if(arr1[j] == arr2[index]) {
                    index++;
                }
                if(index == arr2.length) {
                    index = 0;
                    s2_cnt += 1;
                }
            }
        }
        return s2_cnt / n2;
    }

    public static void main(String[] args) {
        System.out.println(getMaxRepetitions("abaacdbac", 100, "adcbd", 4));
    }
}
