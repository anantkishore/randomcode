package com.kishore.anant.list.linked.leetcode.medium;

public class ReverseLinkedListII {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(head.toString());
        reverseBetween(head, 2, 4);
        System.out.println(head.toString());

        ListNode head2 = new ListNode(5);
        System.out.println(head2.toString());
        reverseBetween(head2, 1, 1);
        System.out.println(head2.toString());

        ListNode head3 = new ListNode(3, new ListNode(5));
        System.out.println(head3.toString());
        reverseBetween(head3, 1, 1);
        System.out.println(head3.toString());
        
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {

        if (left == right)
            return head;

        ListNode curr = head;
        int counter = 1;

        while (counter < left - 1 && curr != null) {
            curr = curr.next;
            counter++;
        }

        ListNode leftNode = curr; // 1
        ListNode reverseList = curr.next;

        counter = left;
        ListNode prev = null;
        ListNode next;
        curr = reverseList;
        while (counter <= right && curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            counter++;
        }
        leftNode.next = prev;

        while (prev != null && left < right) {
            prev = prev.next;
            left++;
        }
        prev.next = curr;
        return head;
    }
}
