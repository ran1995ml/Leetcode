package com.ran.tree;

import com.ran.bean.TreeNode;

/**
 * ClassName: DiameterOfBinaryTree_543
 * Description:
 * date: 2022/2/8 21:18
 *
 * @author ran
 */
public class DiameterOfBinaryTree_543 {
    private int max;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return max;
    }
    public int dfs(TreeNode root){
        if(root==null) return 0;
        int l = dfs(root.left);
        int r = dfs(root.right);
        max = Math.max(max,l+r);
        return Math.max(l,r)+1;
    }
}
