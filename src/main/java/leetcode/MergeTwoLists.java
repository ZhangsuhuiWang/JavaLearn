package leetcode;

public class MergeTwoLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }