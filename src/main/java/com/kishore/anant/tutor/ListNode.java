package com.kishore.anant.tutor;

public class ListNode {
 int val;
 ListNode next;
 ListNode() {}
 ListNode(int val) { this.val = val; }
 ListNode(int val, ListNode next) { this.val = val; this.next = next; }

 @Override
 public String toString() {
  StringBuffer sb = new StringBuffer();
  sb.append(val);
  sb.append(" -> ");
  ListNode next = this.next;
  while (next != null){
    sb.append(next.val);
    sb.append(" -> ");
    next = next.next;
  }
  sb.append("null");
  return sb.toString();
 }
}
