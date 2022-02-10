package com.ran.linkedlist;

import com.ran.bean.ListNode;

/**
 * ClassName: DeleteNode_237
 * Description:
 * date: 2022/2/10 4:20 下午
 *
 * @author ran
 */
public class DeleteNode_237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
