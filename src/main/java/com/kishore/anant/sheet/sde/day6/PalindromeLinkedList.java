package com.kishore.anant.sheet.sde.day6;

import com.kishore.anant.sheet.sde.day6.ListNode;

public class PalindromeLinkedList {

    static ListNode first;
    static boolean isPalindrome = true;

    public static void main(String[] args) {
        com.kishore.anant.sheet.sde.day6.ListNode node1 = new com.kishore.anant.sheet.sde.day6.ListNode(1);
        /*com.kishore.anant.sheet.sde.day6.ListNode node2 = new com.kishore.anant.sheet.sde.day6.ListNode(2);
        com.kishore.anant.sheet.sde.day6.ListNode node3 = new com.kishore.anant.sheet.sde.day6.ListNode(2);
        com.kishore.anant.sheet.sde.day6.ListNode node4 = new com.kishore.anant.sheet.sde.day6.ListNode(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;*/

        System.out.println(isPalindrome(node1));
    }

    public static boolean isPalindrome(ListNode last) {
        first = last;
        recurseList(first);
        return PalindromeLinkedList.isPalindrome;
    }

    public static void recurseList(ListNode node) {

        if (node == null) {
            return;
        }

        recurseList(node.next);

        if (node.val == PalindromeLinkedList.first.val) {
            PalindromeLinkedList.first = first.next;
        } else {
            PalindromeLinkedList.isPalindrome = false;
        }
    }
}
