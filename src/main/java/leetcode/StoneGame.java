package leetcode;

public class StoneGame {
    public static void main(String[] args) {
        int[] piles = new int[]{3, 7, 2, 3};
        int i = 0;
        int j = piles.length-1;
        int sum1 = 0, sum2 = 0;
        while(i < j) {
            if(piles[i] >= piles[j]) {
                sum1 += piles[i];
                i++;
            } else {
                sum1 += piles[j];
                j--;
            }
            if(piles[i] >= piles[j]) {
                sum2 += piles[i];
                i++;
            } else {
                sum2 += piles[j];
                j--;
            }
            System.out.println("sum1: " + sum1 + " sum2: " + sum2);
        }
        System.out.println(sum1 > sum2);
    }
}
