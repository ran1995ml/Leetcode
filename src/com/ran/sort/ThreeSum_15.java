package com.ran.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: ThreeSum_15
 * Description:
 * date: 2022/2/16 1:59 下午
 *
 * @author ran
 */
public class ThreeSum_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) break;
            if(i-1>=0&&nums[i]==nums[i-1]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum==0){
                    list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while (left<right&&nums[left]==nums[left+1]) left++;
                    while (left<right&&nums[right]==nums[right-1]) right--;
                    left++;
                    right--;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ThreeSum_15 obj = new ThreeSum_15();
        int[] nums = {-2,0,0,2,2};
        System.out.println(obj.threeSum(nums).toString());
    }

}
