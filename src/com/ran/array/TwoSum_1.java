package com.ran.array;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: TwoSum_1
 * Description:
 * date: 2022/2/9 5:02 下午
 *
 * @author ran
 */
public class TwoSum_1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
