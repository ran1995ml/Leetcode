package com.ran.array;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: SubarraySum_560
 * Description:前缀和
 * pre[i-1] + num[i] = pre[i]
 * pre[j-1] + k = pre[i]
 * date: 2022/4/15 11:13
 *
 * @author ran
 */
public class SubarraySum_560 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = 3;
        SubarraySum_560 obj = new SubarraySum_560();
        System.out.println(obj.subarraySum(nums,k));
    }

    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int pre = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            pre += nums[i];
            if(map.containsKey(pre-k)){
                count += map.get(pre-k);
            }
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        return count;
    }

    public int subarraySum1(int[] nums, int k) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j>=0;j--){
                sum += nums[j];
                if(sum==k) count++;
            }
        }
        return count;
    }
}
