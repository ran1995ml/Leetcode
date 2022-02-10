package com.ran.linkedlist;

import com.ran.bean.ListNode;

/**
 * ClassName: RemoveElements_203
 * Description:
 * date: 2022/2/10 2:35 下午
 *
 * @author ran
 */
public class RemoveElements_203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode node = new ListNode(val-1);
        node.next = head;
        ListNode p = node;
        while (p!=null&&p.next!=null){
            while (p.next!=null&&p.next.val==val){
                p.next = p.next.next;
            }
            p = p.next;
        }
        return node.next;
    }
}
