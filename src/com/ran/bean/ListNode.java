package com.ran.bean;

/**
 * ClassName: ListNode
 * Description:
 * date: 2022/2/10 11:41 上午
 *
 * @author ran
 */
public class ListNode {
       public int val;
       public ListNode next;
       public ListNode() {}
       public ListNode(int val) { this.val = val; }
       public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
