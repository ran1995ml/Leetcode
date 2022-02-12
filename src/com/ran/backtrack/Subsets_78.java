package com.ran.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Subsets_78
 * Description:
 * date: 2022/2/11 3:37 下午
 *
 * @author ran
 */
public class Subsets_78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        dfs(list,new ArrayList<>(),nums,visited,0);
        return list;
    }

    private void dfs(List<List<Integer>> list,List<Integer> arr,int[] nums,boolean[] visited,int index) {
        if (arr.size() <= nums.length) {
            list.add(new ArrayList<Integer>(arr));
        }
        for (int i = index; i < nums.length; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            arr.add(nums[i]);
            dfs(list, arr, nums, visited, i);
            visited[i] = false;
            arr.remove(arr.size() - 1);
        }
    }
}
