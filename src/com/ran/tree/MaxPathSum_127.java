package com.ran.tree;

import com.ran.bean.TreeNode;

/**
 * ClassName: MaxPathSum_127
 * Description:
 * date: 2022/4/20 11:00
 *
 * @author ran
 */
public class MaxPathSum_127 {
    private int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
    }
    public int dfs(TreeNode root){
        if(root==null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        max = Math.max(max,root.val+Math.max(0,left)+Math.max(0,right));
        return root.val + Math.max(0,Math.max(left,right));
    }

}
