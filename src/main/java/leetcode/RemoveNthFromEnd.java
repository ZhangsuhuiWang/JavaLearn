package leetcode;

public class RemoveNthFromEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null && n == 1) {
            return null;
        }
        ListNode p = head;
        ListNode q = head;
        for(int i = 0; i < n; i++) {
            q = q.next;
        }
        if(q == null) {
            return head.next;
        }
        while(p.next != null && q.next != null) {
            p = p.next;
            q = q.next;
        }
        p.next = p.next.next;
        return head;
    }

    public static void main(String[] args) {

    }
}


