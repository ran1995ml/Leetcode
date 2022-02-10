package com.ran.linkedlist;

import com.ran.bean.ListNode;

/**
 * ClassName: AddTwoNumbers
 * Description:
 * date: 2022/2/10 11:42 上午
 *
 * @author ran
 */
public class AddTwoNumbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int col = 0;
        int sum = 0;
        ListNode head = new ListNode(-1);
        ListNode node = head;
        while (l1!=null||l2!=null){
            int v1 = l1 == null?0:l1.val;
            int v2 = l2 == null?0:l2.val;
            sum = (v1 + v2 + col) % 10;
            col = (v1 + v2 + col) / 10;
            node.next = new ListNode(sum);
            node = node.next;
            l1 = l1 == null?l1:l1.next;
            l2 = l2 == null?l2:l2.next;
        }
        if(col>0){
            node.next = new ListNode(col);
        }
        return head.next;
    }
}
