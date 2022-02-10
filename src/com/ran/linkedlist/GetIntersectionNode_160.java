package com.ran.linkedlist;

import com.ran.bean.ListNode;

/**
 * ClassName: GetIntersectionNode_160
 * Description:
 * date: 2022/2/10 2:26 下午
 *
 * @author ran
 */
public class GetIntersectionNode_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;
        while (p1!=p2){
            p1 = p1 == null?headB:p1.next;
            p2 = p2 == null?headA:p2.next;
        }
        return p1;
    }
}
