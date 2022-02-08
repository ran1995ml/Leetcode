package com.ran.tree;


import com.ran.bean.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * ClassName: BinaryTreeInorderTraversal_94
 * Description:非递归实现，先遍历左子树，根节点入栈
 * 当左子树为空，从栈中弹出根节点，若右子树不为空，再遍历右子树
 * date: 2022/2/8 3:35 下午
 *
 * @author ran
 */
public class InorderTraversal_94 {

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        if(root==null) return arr;
        Stack<TreeNode> stack = new Stack<>();
        while (root!=null||!stack.isEmpty()){
            if(root!=null){
                stack.add(root);
                root = root.left;
            }else{
                root = stack.pop();
                arr.add(root.val);
                root = root.right;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node1.right = node2;
        node2.left = node3;
        System.out.println(inorderTraversal(node1));
    }
}
