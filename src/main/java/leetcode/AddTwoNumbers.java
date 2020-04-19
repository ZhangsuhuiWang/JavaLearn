package leetcode;

import java.util.*;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while(l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }
        ListNode ans = new ListNode(0);
        ListNode p = ans;
        int carry = 0;
        int sum = 0;
        while(!stack1.isEmpty() && !stack2.isEmpty()) {
            sum = (stack1.peek() + stack2.peek() + carry) % 10;
            System.out.println("stack1.peek(): " + stack1.peek() + " stack2.peek(): " + stack2.peek());
            ListNode node = new ListNode(sum);
            node.next = p.next;
            p.next = node;
            carry = (stack1.peek() + stack2.peek() + carry) / 10;
            stack1.pop();
            stack2.pop();
            System.out.println("1-sum: " + sum + " carry: " + carry);
//            print(ans);
        }
        while(!stack1.isEmpty()) {
            sum = (stack1.peek() + carry) % 10;
            carry = (stack1.peek() + carry) / 10;
            ListNode node = new ListNode(sum);
            node.next = p.next;
            p.next = node;
            stack1.pop();
            System.out.println("2-sum: " + sum + " carry: " + carry);
        }
        while(!stack2.isEmpty()) {
            sum = (stack2.peek() + carry) % 10;
            carry = (stack2.peek() + carry) / 10;
            ListNode node = new ListNode(sum);
            node.next = p.next;
            p.next = node;
            stack2.pop();
            System.out.println("3-sum: " + sum + " carry: " + carry);
        }
        if(carry != 0) {
            ListNode node = new ListNode(carry);
            node.next = p.next;
            p.next = node;
        }
        return ans.next;
    }

    public static void print(ListNode l) {
        ListNode p = l;
        while(p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*
        [6,4,5,0,4,4,9,4,1]
        [3,8,8,0,3,0,1,4,8]
         */
        int[] a = {6,4,5,0,4,4,9,4,1};
        int[] b = {3,8,8,0,3,0,1,4,8};
        ListNode l1 = new ListNode(0);
        ListNode p = l1;
        for(int i = 0; i < a.length; i++) {
            ListNode node = new ListNode(a[i]);
            p.next = node;
            p = p.next;
        }
        System.out.print("l1: ");
        print(l1.next);
        ListNode l2 = new ListNode(0);
        p = l2;
        for(int i = 0; i < b.length; i++) {
            ListNode node = new ListNode(b[i]);
            p.next = node;
            p = p.next;
        }
        System.out.print("l2: ");
        print(l2.next);
//        System.out.print("ans: ");
        print(addTwoNumbers(l1.next, l2.next));
    }
}
