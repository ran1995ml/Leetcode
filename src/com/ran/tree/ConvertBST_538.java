package com.ran.tree;

import com.ran.bean.TreeNode;

/**
 * ClassName: ConvertBST_538
 * Description:
 * date: 2022/2/10 7:56 下午
 *
 * @author ran
 */
public class ConvertBST_538 {
    private int sum;
    public TreeNode convertBST(TreeNode root) {
        dfs(root);
        return root;
    }
    private void dfs(TreeNode root) {
        if(root==null) return;
        dfs(root.right);
        sum += root.val;
        root.val = sum;
        dfs(root.left);
    }
}
