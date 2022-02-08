package com.ran.tree;

import com.ran.bean.TreeNode;

/**
 * ClassName: BuildTree_105
 * Description:
 * date: 2022/2/8 22:17
 *
 * @author ran
 */
public class BuildTree_105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    public TreeNode build(int[] preorder,int s1,int e1,int[] inorder,int s2,int e2){
        if(e1<s1||e2<s2) return null;
        int value = preorder[s1];
        int index = s2;
        while(inorder[index]!=value){
            index++;
        }
        TreeNode root = new TreeNode(value);
        root.left = build(preorder,s1+1,s1+index-s2,inorder,s2,index-1);
        root.right = build(preorder,s1+index-s2+1,e1,inorder,index+1,e2);
        return root;
    }
}
