package leetcode;

import java.util.*;

import static leetcode.MaxDistance.print;

public class FindContinuousSequence {
    public static int[][] findContinuousSequence(int target) {
        List<int[]> ans = new ArrayList<>();
        int start = 1, end = 2;
        int count = 0;
        while (start < end) {
            int sum = (start + end) * (end - start + 1) / 2;
            if (sum < target) {
                end++;
            } else if(sum > target) {
                start++;
            } else {
                int[] sub_ans = new int[end - start + 1];
                for(int i = start, j = 0; i <= end; i++, j++) {
                    sub_ans[j] = i;
                }
                ans.add(sub_ans);
                start++;
            }
        }
        return ans.toArray(new int[ans.size()][]);

    }

    public static void main(String[] args) {
        print(findContinuousSequence(9));
    }

}
