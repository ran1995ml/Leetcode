package com.ran.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: DisappearedNumbers_448
 * Description:
 * date: 2022/2/28 2:09 下午
 *
 * @author ran
 */
public class DisappearedNumbers_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[Math.abs(nums[i])-1]<0) continue;
            nums[Math.abs(nums[i])-1] = - nums[Math.abs(nums[i])-1];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) ans.add(i+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        DisappearedNumbers_448 obj = new DisappearedNumbers_448();
        System.out.println(obj.findDisappearedNumbers(nums).toString());
    }
}
