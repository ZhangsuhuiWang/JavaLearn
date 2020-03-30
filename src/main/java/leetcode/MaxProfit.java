package leetcode;

public class MaxProfit {
    public static int maxProfit(int[] prices) {
        if(prices.length == 0) {
            return 0;
        }
        int[] profit = new int[prices.length];
        for(int i = 1; i < prices.length; i++) {
            profit[i] = prices[i] - minPrices(prices, i-1);
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < profit.length; i++) {
            max = Math.max(max, profit[i]);
        }
        return max;
    }

    public static int minPrices(int[] prices, int length) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i <= length; i++) {
            min = Math.min(min, prices[i]);
        }
        return min;
    }

    public static int maxProfit_2(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < min) {
                min = prices[i];
            }
            max = max > (prices[i] - min) ? max : (prices[i] - min);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
//        System.out.println(maxProfit(arr));
        System.out.println(maxProfit_2(arr));
    }
}
