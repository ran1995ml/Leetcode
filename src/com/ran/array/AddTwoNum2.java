package com.ran.array;

import com.ran.domain.ListNode;

import java.util.Arrays;

/**
 * ClassName: AddTwoNum2
 * Description:两数相加
 * 注意两个链表不相同，每次循环都需要判断一个是否为空
 * date: 2021/12/13 22:37
 *
 * @author ran
 */
public class AddTwoNum2 {
    public static void main(String[] args) {
        int[] array1 = {9,9,9,9,9,9,9};
        int[] array2 = {9,9,9,9};
        ListNode node = addTwoNumbers(ListNode.getListNode(array1),ListNode.getListNode(array2));
        System.out.println(Arrays.toString(ListNode.getArray(node)));
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode node = new ListNode(0);
        ListNode head = node;
        int sum = 0;
        int col = 0;
        while(head1!=null||head2!=null){
            int val1 = head1==null?0:head1.val;
            int val2 = head2==null?0:head2.val;
            sum = (val1 + val2 + col) % 10;
            col = (val1 + val2 + col) / 10;
            head.next = new ListNode(sum);
            head = head.next;
            head1 = head1==null?null:head1.next;
            head2 = head2==null?null:head2.next;
        }
        if(col>0){
            head.next = new ListNode(col);
        }
        return node.next;
    }
}
