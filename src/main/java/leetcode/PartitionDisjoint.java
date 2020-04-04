package leetcode;

public class PartitionDisjoint {
    public static int partitionDisjoint(int[] A) {
        int[] maxLeft = new int[A.length];
        maxLeft[0] = A[0];
        for(int i = 1; i < A.length; i++) {
            maxLeft[i] = Math.max(A[i], maxLeft[i-1]);
        }
        print(maxLeft);
        int[] minRight = new int[A.length];
        minRight[A.length-1] = A[A.length-1];
        for(int i = A.length - 2; i >= 0; i--) {
            minRight[i] = Math.min(A[i], minRight[i + 1]);
        }
        print(minRight);
        int index = 0;
        for(int i = 1; i < A.length; i++) {
            if(maxLeft[i-1] <= minRight[i]) {
                index = i;
            }
        }
        return index;
    }

    public static void print(int[] A) {
        for(int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] A = {5,0,3,8,6};
        System.out.println(partitionDisjoint(A));
    }
}
