package com.ran.linkedlist;

import com.ran.bean.ListNode;

/**
 * ClassName: DetectCycle_142
 * Description:
 * date: 2022/3/1 10:38 上午
 *
 * @author ran
 */
public class DetectCycle_142 {
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null) return null;
        ListNode p1 = head.next;
        ListNode p2 = head.next.next;
        while(p1!=p2){
            if(p2==null||p2.next==null) return null;
            p1 = p1.next;
            p2 = p2.next.next;
        }
        p1 = head;
        while (p1!=p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
