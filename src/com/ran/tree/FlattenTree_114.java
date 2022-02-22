package com.ran.tree;

import com.ran.bean.TreeNode;

/**
 * ClassName: FlattenTree_114
 * Description:
 * date: 2022/2/22 11:01 上午
 *
 * @author ran
 */
public class FlattenTree_114 {
    public void flatten(TreeNode root) {
        if(root==null) return;
        flatten(root.left);
        flatten(root.right);
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = null;
        while (root.right!=null){
            root = root.right;
        }
        root.right = temp;
    }

    public static void main(String[] args) {
        int[] preorder = {1,2,3,4,5,6};
        int[] inorder = {3,2,4,1,5,6};
        BuildTree_105 obj = new BuildTree_105();
        TreeNode root = obj.buildTree(preorder, inorder);
    }
}
