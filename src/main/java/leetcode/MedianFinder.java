package leetcode;

import java.util.*;

public class MedianFinder {
    List<Integer> list;
    private int index;

    public MedianFinder() {
        list = new ArrayList<>();
        index = 0;
    }

    public void addNum(int num) {
        if(list.size() == 0) {
            list.add(num);
        } else {
            list.add(num);
            Collections.sort(list);
        }
        index += 1;

    }

    public double findMedian() {
        if(index == 0) {
            return -1;
        }
        return index % 2 == 0 ? (list.get(index/2-1) + list.get(index/2))/2.0 : list.get(index/2);
    }
}
