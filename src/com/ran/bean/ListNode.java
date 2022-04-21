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

       public static ListNode transfromNums(int[] nums){
              ListNode pre = new ListNode(nums[0]);
              ListNode head = pre;
              for(int i=1;i<nums.length;i++){
                     pre.next = new ListNode(nums[i]);
                     pre = pre.next;
              }
              return head;
       }

       public static void printListNode(ListNode head){
              while (head!=null){
                     System.out.print(head.val+" ");
                     head = head.next;
              }
       }
}
