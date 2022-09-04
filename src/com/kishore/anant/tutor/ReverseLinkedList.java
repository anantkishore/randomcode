package com.kishore.anant.tutor;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        System.out.println(node1);
        reverseList(node1);
    }

    public static void reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = head.next;
        while(next != null){
            curr = next;
            next = curr.next;
            curr.next = null;
        }
    }
}
