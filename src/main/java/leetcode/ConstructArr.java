package leetcode;

public class ConstructArr {
    public static int[] constructArr(int[] a) {
        int[] b = new int[a.length];
        int left = 1;
        b[0] = 1;
        for(int i = 0; i < a.length; i++) {
            b[i] = left;
            left *= a[i];
        }
        int right = 1;
        for(int i = a.length - 1; i >= 0; i--) {
            b[i] *= right;
            right *= a[i];
        }
        return b;
    }

    private static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        print(constructArr(a));
    }
}
