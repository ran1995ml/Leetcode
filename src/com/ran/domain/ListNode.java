package com.ran.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: ListNode
 * Description:
 * date: 2021/12/13 22:36
 *
 * @author ran
 */
public class ListNode {
       public int val;
       public ListNode next;
       public ListNode() {}
       public ListNode(int val) { this.val = val; }
       public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
       public static ListNode getListNode(int[] array){
              ListNode node = new ListNode(0);
              ListNode head = node;
              for(int i:array){
                     head.next = new ListNode(i);
                     head = head.next;
              }
              return node.next;
       }
       public static Integer[] getArray(ListNode head){
              List<Integer> list = new ArrayList<>();
              while (head!=null){
                     list.add(head.val);
                     head = head.next;
              }
              return list.toArray(new Integer[0]);
       }
}
