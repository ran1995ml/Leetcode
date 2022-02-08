package com.ran.tree;


import com.ran.bean.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * ClassName: LevelOrder_102
 * Description:层次遍历，用队列维护每一层节点
 * date: 2022/2/8 4:22 下午
 *
 * @author ran
 */
public class LevelOrder_102 {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();
        if(root==null) return arr;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            arr.add(list);
        }
        return arr;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node1.left = node2;
        node1.right = node3;
        System.out.println(levelOrder(node1));
    }
}
