package leetcode;

public class MinIncrementForUnique {
    public static void main(String[] args) {
        int[] A = new int[]{3,2,1,2,1,7};
        q_sort(A, 0, A.length-1);
        print(A);
        int count = 0;
        for(int i = 0; i < A.length - 1; i++) {
            while(A[i] >= A[i+1]) {
                A[i+1]++;
                count++;
            }
        }
        print(A);
        System.out.println("times: " + count);

    }

    public static void q_sort(int[] arr, int start, int end) {
        if(start < end) {
            int i = start, j = end;
            int flag = arr[start];
            while(i < j) {
                while(arr[j] >= flag && j > i) {
                    j--;
                }
                if(i < j) {
                    arr[i] = arr[j];
                    i++;
                }
                while(arr[i] < flag && j > i) {
                    i++;
                }
                if(i < j) {
                    arr[j] = arr[i];
                    j--;
                }
            }
            arr[i] = flag;
            q_sort(arr, start, i-1);
            q_sort(arr, i+1, end);
        }
    }

    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
