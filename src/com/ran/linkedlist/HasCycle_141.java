package com.ran.linkedlist;

import com.ran.bean.ListNode;

/**
 * ClassName: HasCycle_141
 * Description:
 * date: 2022/2/10 12:19 下午
 *
 * @author ran
 */
public class HasCycle_141 {
    public boolean hasCycle(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        while(p1!=null&&p1.next!=null){
            p1 = p1.next.next;
            p2 = p2.next;
            if(p1==p2) return true;
        }
        return false;
    }
}
