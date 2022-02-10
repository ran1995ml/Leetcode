package com.ran.linkedlist;

import com.ran.bean.ListNode;

/**
 * ClassName: ReverseList_206
 * Description:
 * date: 2022/2/10 3:06 下午
 *
 * @author ran
 */
public class ReverseList_206 {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode cur = head;
        ListNode pre = null;
        ListNode next = null;
        while(cur!=null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
