package com.ran.tree;


import com.ran.bean.TreeNode;

/**
 * ClassName: IsValidBST_98
 * Description:二叉搜索树中序遍历
 * date: 2022/2/8 4:47 下午
 *
 * @author ran
 */
public class IsValidBST_98 {
    private static long min = Long.MIN_VALUE;
    private static boolean res = true;
    public static boolean isValidBST(TreeNode root) {
        if(root==null) return false;
        dfs(root);
        return res;
    }

    private static void dfs(TreeNode root) {
        if(root==null) return;
        dfs(root.left);
        if(root.val>min){
            min = root.val;
        }else{
            res = false;
            return;
        }
        dfs(root.right);
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        node1.left = node2;
        node1.right = node3;
        System.out.println(isValidBST(node1));
    }
}
