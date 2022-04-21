package com.ran.tree;

import com.ran.bean.TreeNode;

import java.util.Arrays;

/**
 * ClassName: TreeSerialize
 * Description:
 * date: 2022/4/20 19:51
 *
 * @author ran
 */
public class TreeSerialize_297 {
    private StringBuffer tree = new StringBuffer();
    private int index;

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;
        TreeSerialize_297 obj = new TreeSerialize_297();
        String serialize = obj.serialize(null);
        System.out.println(Arrays.toString(serialize.split("_")));

        TreeNode root = obj.deserialize(serialize);

    }

    public String serialize(TreeNode root) {
        if(root==null) return "";
        serDfs(root);
        return tree.toString();
    }

    public void serDfs(TreeNode root){
        if(root==null){
            tree.append("null_");
            return;
        }
        tree.append(root.val).append("_");
        serDfs(root.left);
        serDfs(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("")) return null;
        String[] nodes = data.split("_");
        return deserDfs(nodes);
    }

    public TreeNode deserDfs(String[] nodes){
        if(nodes[index].equals("null")){
            index++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(nodes[index]));
        index++;
        root.left = deserDfs(nodes);
        root.right = deserDfs(nodes);
        return root;
    }


}
