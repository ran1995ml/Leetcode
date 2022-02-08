package com.ran.tree;

import com.ran.bean.TreeNode;

/**
 * ClassName: InvertTree_226
 * Description:
 * date: 2022/2/8 21:03
 *
 * @author ran
 */
public class InvertTree_226 {
    public TreeNode invertTree(TreeNode root) {
        dfs(root);
        return root;
    }
    public void dfs(TreeNode root){
        if(root==null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        dfs(root.left);
        dfs(root.right);
    }
}
