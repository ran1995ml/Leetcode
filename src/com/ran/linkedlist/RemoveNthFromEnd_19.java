package com.ran.linkedlist;

import com.ran.bean.ListNode;

/**
 * ClassName: RemoveNthFromEnd_19
 * Description:
 * date: 2022/2/10 12:07 下午
 *
 * @author ran
 */
public class RemoveNthFromEnd_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = new ListNode(-1);
        node.next = head;
        ListNode p1 = node;
        ListNode p2 = node;
        while(n+1>0){
            p1 = p1.next;
            n--;
        }
        while(p1!=null){
            p1 = p1.next;
            p2 = p2.next;
        }
        p2.next = p2.next.next;
        return node.next;
    }
}
