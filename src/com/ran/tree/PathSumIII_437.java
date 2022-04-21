package com.ran.tree;

import com.ran.bean.TreeNode;

/**
 * ClassName: PathSumIII_437
 * Description:双重递归
 * date: 2022/4/19 19:53
 *
 * @author ran
 */
public class PathSumIII_437 {
    private int sum;

    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        dfs(root,targetSum);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
        return sum;
    }

    public void dfs(TreeNode root, int targetSum){
        if(root==null) return;
        targetSum -= root.val;
        if(targetSum==0){
            sum++;
        }
        dfs(root.left,targetSum);
        dfs(root.right,targetSum);
    }
}
