package com.ran.linkedlist;

import com.ran.bean.ListNode;

import java.util.List;

/**
 * ClassName: IsPalindrome_234
 * Description:
 * date: 2022/2/22 7:50 下午
 *
 * @author ran
 */
public class IsPalindrome_234 {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null) return true;
        ListNode middle = getMiddleNode(head);
        ListNode newHead = rotateNode(middle);
        while(head!=null){
            if(head.val!=newHead.val) return false;
            head = head.next;
            newHead = newHead.next;
        }
        return true;
    }
    private ListNode getMiddleNode(ListNode head){
        ListNode node = new ListNode(-1);
        node.next = head;
        ListNode p1 = node;
        ListNode p2 = node;
        while (p2!=null&&p2.next!=null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        return p1;
    }
    private ListNode rotateNode(ListNode head){
        ListNode next = null;
        ListNode pre = null;
        while (head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
