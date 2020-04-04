package leetcode;

import java.util.*;

public class MergeKLists {
    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) {
            return null;
        }
        return merge(lists, 0, lists.length-1);
    }

    public static ListNode merge(ListNode[] lists, int left, int right) {
        if(left == right) {
            return lists[left];
        }
        int mid = (left + right) / 2;
        ListNode l1 = merge(lists, left, mid-1);
        ListNode l2 = merge(lists, mid, right);
        return mergeList(l1, l2);
    }

    public static ListNode mergeList(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        while(l1 != null && l2 != null) {
            if(l1.val > l2.val) {
                ListNode listNode = new ListNode(l2.val);
                l2 = l2.next;
                l3.next = listNode;
            } else {
                ListNode listNode = new ListNode(l1.val);
                l1 = l1.next;
                l3.next = listNode;
            }
        }

        while(l1 != null) {
            l3.next = l1;
        }

        while(l2 != null) {
            l3.next = l2;
        }
        return l3.next;
    }

    public static void main(String[] args) {
    }
}
