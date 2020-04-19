package leetcode;

import java.util.*;

public class Merge {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        for(int i = 0; i < intervals.length; i++) {
            System.out.print("[" + intervals[i][0] + " " + intervals[i][1] + "]");
        }
        System.out.println();
        int i = 0;
        List<int[]> ans = new ArrayList<>();
        while(i < intervals.length) {
            int low = intervals[i][0];
            int high = intervals[i][1];
            while(i < intervals.length-1 && high >= intervals[i+1][0]) {
                low = Math.min(low, intervals[i+1][1]);
                high = Math.max(high, intervals[i+1][1]);
                System.out.println(low + " " + high);
                i++;
            }
            ans.add(new int[]{low, intervals[i][1]});
            i++;
        }
        return ans.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{2,3},{4,5},{6,7},{8,9},{1,10}};
        System.out.println(merge(intervals));
    }

}

