package com.ran.bean;

/**
 * ClassName: TreeNode
 * Description:
 * date: 2022/2/8 3:24 下午
 *
 * @author ran
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
