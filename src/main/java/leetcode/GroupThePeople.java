package leetcode;

import java.util.*;

public class GroupThePeople {
    public static List<List<Integer>>  groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < groupSizes.length; i++) {
            if(map.containsKey(groupSizes[i])) {
                if(map.get(groupSizes[i]).size() == groupSizes[i]) {
                    ans.add(map.remove(groupSizes[i]));
                    map.put(groupSizes[i], new ArrayList<>());
                    System.out.println("1:" + map);
                }
            } else {
                map.put(groupSizes[i], new ArrayList<>());
                System.out.println("3: " + map);
            }
            map.get(groupSizes[i]).add(i);
        }
        System.out.println(map);
        for(Integer integer: map.keySet()) {
            ans.add(map.get(integer));
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] groupSizes = {3,3,3,3,3,1,3};
        System.out.println((groupThePeople(groupSizes)));
    }
}
