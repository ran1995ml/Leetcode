package com.ran.tree;


import com.ran.bean.TreeNode;

/**
 * ClassName: IsSameTree_100
 * Description:
 * date: 2022/2/8 5:56 下午
 *
 * @author ran
 */
public class IsSameTree_100 {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null) return true;
        if(p==null||q==null) return false;
        if(p.val!=q.val) return false;
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
