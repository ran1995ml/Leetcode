package com.ran.tree;

import com.ran.bean.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: RobIII_337
 * Description:
 * date: 2022/4/19 17:31
 *
 * @author ran
 */
public class RobIII_337 {
    private final Map<TreeNode,Integer> map = new HashMap<>();

    public int rob(TreeNode root) {
        dfs(root);
        return map.get(root);
    }

    public void dfs(TreeNode root){
        if(root==null) return;
        dfs(root.left);
        dfs(root.right);
        int sum = root.val;
        if(root.left!=null){
            sum += map.getOrDefault(root.left.left,0) + map.getOrDefault(root.left.right,0);
        }
        if(root.right!=null){
            sum += map.getOrDefault(root.right.left,0) + map.getOrDefault(root.right.right,0);
        }
        map.put(root,Math.max(sum,map.getOrDefault(root.left,0)+map.getOrDefault(root.right,0)));
    }
}
