package com.kishore.anant.list.linked.leetcode.medium;


/*
  Definition for singly-linked list. */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode curr = this;
        while (curr != null) {
            sb.append(curr.val);
            sb.append(" --> ");
            curr = curr.next;
        }

        return sb.toString();
    }
}
