package com.ran.sort;

import com.ran.bean.ListNode;

/**
 * ClassName: SortList_148
 * Description:
 * date: 2022/4/18 15:57
 *
 * @author ran
 */
public class SortList_148 {
    public static void main(String[] args) {
        int[] nums = {-1,5,3,4,0};
        ListNode head = ListNode.transfromNums(nums);
        SortList_148 obj = new SortList_148();
        ListNode.printListNode(obj.sortList(head));
    }
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode middle = getMiddleNode(head);
        ListNode right = middle.next;
        middle.next = null;
        return merge(sortList(head),sortList(right));
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode node = new ListNode(0);
        ListNode head = node;
        while(left!=null&&right!=null){
            if(left.val<right.val){
                head.next = left;
                left = left.next;
            }else{
                head.next = right;
                right = right.next;
            }
            head = head.next;
        }
        if (left!=null){
            head.next = left;
        }
        if (right!=null){
            head.next = right;
        }
        return node.next;
    }


    private ListNode getMiddleNode(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode p1 = head;
        ListNode p2 = head;
        ListNode pre = null;
        while(p2!=null&&p2.next!=null){
            pre = p1;
            p1 = p1.next;
            p2 = p2.next.next;
        }
        return pre;
    }

}
