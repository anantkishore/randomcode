package com.kishore.anant.sheet.sde.day5;

public class RemoveNthFromEnd {

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

        //node1.next = null;

        ListNode result = removeNthFromEnd(node1, 5);

        while (result != null){
            System.out.print(result.val+" -> ");
            result = result.next;
        }

        System.out.print("null");
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        int count = n;
        ListNode fastPtr = head;
        while(count >= 0 && fastPtr != null){
            fastPtr = fastPtr.next;
            count--;
        }

        if(fastPtr == null && count == 0){
            head = head.next;
        }
        else{
            ListNode slowPtr = head;

            while(fastPtr != null){
                fastPtr = fastPtr.next;
                slowPtr = slowPtr.next;
            }

            if(slowPtr.next != null)
                slowPtr.next = slowPtr.next.next;
        }


        return head;

    }
}
