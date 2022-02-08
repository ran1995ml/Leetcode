package com.ran.tree;

import com.ran.bean.TreeNode;

/**
 * ClassName: MaxDepth_104
 * Description:
 * date: 2022/2/8 20:54
 *
 * @author ran
 */
public class MaxDepth_104 {
    public static int maxDepth(TreeNode root) {
        return dfs(root);
    }
    public static int dfs(TreeNode root){
        if(root==null) return 0;
        int l = dfs(root.left);
        int r = dfs(root.right);
        return Math.max(l,r)+1;
    }
}
