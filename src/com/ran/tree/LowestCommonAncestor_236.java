package com.ran.tree;

import com.ran.bean.TreeNode;

/**
 * ClassName: LowestCommonAncestor_236
 * Description:一旦遍历到目标节点，返回目标节点本身，否则返回null
 * date: 2022/2/8 21:40
 *
 * @author ran
 */
public class LowestCommonAncestor_236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(root==p||root==q) return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left==null&&right==null) return null;
        if(left==null||right==null) return left==null?right:left;
        return root;
    }
}
