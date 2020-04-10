package leetcode;


public class LFUCache {
    private TListNode head;
    private int capacity;
    private int count = 1;

    public LFUCache(int capacity) {
        head = new TListNode(0, 0);
        this.capacity = capacity+1;
    }

    public int get(int key) {
        TListNode p = head.next;
        TListNode q = head;
        int i = 1;
        while(p != null) {
            if(p.key == key) {
                q.next = p.next;
                p.next = head.next;
                head.next = p;
                return p.val;
            } else {
                p = p.next;
                q = q.next;
            }
        }

        return -1;
    }

    public void put(int key, int value) {
        TListNode node = new TListNode(key, value);

        TListNode p = head.next;
        if(count < capacity){
            node.next = head.next;
            head.next = node;
            count++;
            // System.out.println("---------");
            // System.out.println(head.next.key + " " + head.next.val);
            // System.out.println("----------");
        } else {
            while(p.next.next != null) {
                p = p.next;
            }
            p.next = null;
            node.next = head.next;
            head.next = node;
        }
        // p = head;
        // System.out.println("*****************");
        // while(p != null) {
        //     System.out.println(p.key + " " + p.val);
        //     p = p.next;
        // }
        // System.out.println("*****************");
    }
}

class TListNode {
    int key, val;
    TListNode next;
    TListNode(int x, int y) {
        key = x;
        val = y;
    }
}