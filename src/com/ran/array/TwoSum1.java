package com.ran.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: TwoSum1
 * Description:两数之和
 * 用Map降低时间复杂度
 * date: 2021/12/12 16:43
 *
 * @author ran
 */
public class TwoSum1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }
}
