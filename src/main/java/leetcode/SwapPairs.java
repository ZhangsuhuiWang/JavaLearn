package leetcode;

public class SwapPairs {
    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode l1 = head;
        ListNode l2 = head.next;

        l1.next = swapPairs(l2.next);
        l2.next = l1;

        return l2;

    }

    public static void print(ListNode head) {
        ListNode p = head;
        while(p != null ){
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        for(int i = 1; i <= 4; i++) {
            p.next = new ListNode(i);
            p = p.next;
        }
        p.next = null;
        print(swapPairs(head.next));
    }
}
