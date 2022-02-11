package com.ran.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: CombinationSum_39
 * Description:
 * date: 2022/2/11 2:17 下午
 *
 * @author ran
 */
public class CombinationSum_39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        dfs(list,new ArrayList<Integer>(),candidates,target,0);
        return list;
    }
    public void dfs(List<List<Integer>> list, List<Integer> arr, int[] candidates, int target, int index) {
        if(target<0) return;
        if(target==0){
            list.add(new ArrayList<Integer>(arr));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            arr.add(candidates[i]);
            dfs(list,arr,candidates,target-candidates[i],i);
            arr.remove(arr.size()-1);
        }
    }
}
