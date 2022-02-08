package com.ran.tree;


import com.ran.bean.TreeNode;

/**
 * ClassName: IsSymmetric
 * Description:
 * date: 2022/2/8 6:07 下午
 *
 * @author ran
 */
public class IsSymmetric_101 {
    public static boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return dfs(root.left,root.right);
    }

    public static boolean dfs(TreeNode roo1,TreeNode root2){
        if(roo1==null&&root2==null) return true;
        if(roo1==null||root2==null) return false;
        if(roo1.val!=root2.val) return false;
        return dfs(roo1.left,root2.right)&&dfs(roo1.right,root2.left);
    }
}
