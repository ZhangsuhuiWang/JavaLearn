package leetcode;

import java.util.*;

public class Intersection {
    public static double[] intersection(double[] start1, double[] end1, double[] start2, double[] end2) {
        double[] ans = new double[2];
        if(start1[0] == end1[0]) {
            if (start2[0] == end2[0]) {
                if (start1[0] == start2[0] && (end1[1] >= start2[1])) {
                    ans[0] = start1[0];
                    ans[1] = Math.min(start1[1], start2[1]);
                    return ans;
                } else {
                    return new double[]{};
                }
            } else {
                double k2 = (float)(start2[1] - end2[1]) / (start2[0] - end2[0]);
                double b2 = (float)(start2[1] * end2[0] - end2[1] * start2[0]) / (end2[0] - start2[0]);
                double y = k2 * start1[0] + b2;
                if(y >= start1[1] && y <= end1[1]) {
                    ans[0] = start1[0];
                    ans[1] = y;
                    return ans;
                }
                return new double[]{};
            }
        } else if (start2[0] == end2[0]) {
            double k1 = (float)(start1[1] - end1[1]) / (start1[0] - end1[0]);
            double b1 = (float)(start1[1] * end1[0] - end1[1] * start1[0]) / (end1[0] - start1[0]);
            double y = k1 * start2[0] + b1;
            if(y >= start2[1] && y <= end2[1]) {
                ans [0] = start2[0];
                ans[1] = y;
                return ans;
            }
            return new double[]{};
        }
        double k1 = (float)(start1[1] - end1[1]) / (start1[0] - end1[0]);
        double k2 = (float)(start2[1] - end2[1]) / (start2[0] - end2[0]);
        double b1 = (float)(start1[1] * end1[0] - end1[1] * start1[0]) / (end1[0] - start1[0]);
        double b2 = (float)(start2[1] * end2[0] - end2[1] * start2[0]) / (end2[0] - start2[0]);
        System.out.println("k1: " + k1 + " b1: " + b1 + " k2: " + k2 + " b2 :" + b2);
        if(k1 == k2 && b1 == b2 && (end1[0] > start2[0])) {
            ans[0] = Math.max(start1[0], start2[0]);
            ans[1] = Math.max(start1[1], start2[1]);
            return ans;
        } else if(k1 == k2) {
            return new double[]{};
        }
//        ans[0] = (b1 - b2) / (k2 - k1);
        ans[0] = (((start1[1] * end1[0] - end1[1] * start1[0]) / (end1[0] - start1[0]) - (start2[1] * end2[0] - end2[1] * start2[0]) / (end2[0] - start2[0])) /
                ((start2[1] - end2[1]) / (start2[0] - end2[0]) - (start1[1] - end1[1]) / (start1[0] - end1[0])));
//        ans[1] = k2 * ans[0] + b2;
        ans[1] = ((start2[1] - end2[1]) / (start2[0] - end2[0]) * ans[0] + (start2[1] * end2[0] - end2[1] * start2[0]) / (end2[0] - start2[0]));
        return ans;
    }


    public static void main(String[] args) {
        /*
        input:
            line1 = {0, 0}, {1, 0}
            line2 = {1, 1}, {0, -1}=
        output:
            {0.5, 0}
         */
        double[] start1 = {0,0};
        double[] start2 = {1,1};
        double[] end1 = {1,0};
        double[] end2 = {0,-1};
        double[] ans = intersection(start1, end1, start2, end2);
        System.out.print("example1: ");
        System.out.println(Arrays.toString(ans));
        /*
        input:
            line1 = {27,25}, {55,-31}
            line2 = {37,6}, {46,-15}
        output:
            {40.0,-1.0}
         */
        start1 = new double[]{27,25};
        start2 = new double[]{37,6};
        end1 = new double[]{55,-31};
        end2 = new double[]{46,-15};
        ans = intersection(start1, end1, start2, end2);
        System.out.print("example2: ");
        System.out.println(Arrays.toString(ans));
    }
}
