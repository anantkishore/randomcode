package com.kishore.anant.sheet.sde.day5;

public class MergeTwoLists {

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);

        n1.next = n2;
        n2.next = n3;

        ListNode result = mergeTwoLists(node1, n1);

        while (result != null){
            System.out.println(result.val+" -> ");
            result = result.next;
        }

        System.out.println("-> null");

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode curr1= list1;
        ListNode curr2= list2;

        while(curr1 != null && curr2 != null){
            if(curr1.val <= curr2.val){
                while(curr1.val <= curr2.val){
                    curr1 = curr1.next;
                }
                ListNode next = curr2.next;
                curr2.next = curr1;
                curr1 = curr1.next;
                curr2 = next;
            }
            else{
                while(curr1.val > curr2.val){

                }
            }
        }
        return list1;

    }
}
