package leetcode;

import java.util.*;

public class NumberOfBoomerangs {
    public static int numberOfBoomerangs(int[][] points) {
        int len = points.length;
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < len; i++) {
            map.clear();
            for (int j = 0; j < len; j++) {
                if(i != j) {
                    int dis = (points[i][0] - points[j][0]) * (points[i][0] - points[j][0]) +
                            (points[i][1] - points[j][1]) * (points[i][1] - points[j][1]);
                    if(map.containsKey(dis)) {
                        ans += map.get(dis) * 2;
                        map.put(dis, map.get(dis) + 1);
                    } else {
                        map.put(dis, 1);
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] points = {{0,0},{1,0},{2,0}};
        System.out.println(numberOfBoomerangs(points));
    }
}
