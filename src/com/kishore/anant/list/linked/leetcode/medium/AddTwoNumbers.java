package com.kishore.anant.list.linked.leetcode.medium;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(2);
        ListNode list2 = new ListNode(5);

        list1.next=new ListNode(4);
        list1.next.next =new ListNode(3);

        list2.next=new ListNode(6);
        list2.next.next =new ListNode(4);

        ListNode result = addTwoNumbers(list1, list2);

        System.out.println(result.toString());

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carryForward = 0, sum = 0;
        ListNode result = new ListNode();
        ListNode head = result;

        while(l1 != null && l2 != null){

            sum = l1.val + l2.val + carryForward;
            result.next = new ListNode(sum%10);

            if(sum >= 10){
                carryForward = 1;
            }
            else{
                carryForward = 0;
            }
            result = result.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            sum = l1.next.val + carryForward;
            result.next = new ListNode(sum%10);
            if(sum >= 10){
                carryForward = 1;
            }
            else{
                carryForward=0;
            }
            result = result.next;
            l1 = l1.next;
        }

        while(l2 != null){
            sum = l2.next.val + carryForward;
            result.next = new ListNode(sum%10);
            if(sum >= 10){
                carryForward = 1;
            }
            else{
                carryForward=0;
            }
            result = result.next;
            l2 = l2.next;
        }

        if(carryForward == 1){
            result.next = new ListNode(carryForward);
        }

        return head.next;





    }
}
