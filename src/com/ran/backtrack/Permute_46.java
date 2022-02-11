package com.ran.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: permute_46
 * Description:
 * date: 2022/2/11 3:17 下午
 *
 * @author ran
 */
public class Permute_46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        dfs(list,nums,visited,new ArrayList<Integer>());
        return list;
    }
    public void dfs(List<List<Integer>> list,int[] nums,boolean[] visited,List<Integer> arr){
        if(arr.size()== nums.length){
            list.add(new ArrayList<>(arr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]) continue;
            arr.add(nums[i]);
            visited[i] = true;
            dfs(list,nums,visited,arr);
            visited[i] = false;
            arr.remove(arr.size()-1);
        }
    }
}
