package com.ran.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * ClassName: DisappearedNumbers_448
 * Description:一次遍历，很容易想到用哈希表空间换时间
 * 不使用额外空间：数组内只包含1～N，将数组中出现过的数字作为下标，对应下标的值置为负数
 * 再次遍历数组，大于0的索引即为没出现过的数字
 * date: 2022/2/28 2:09 下午
 *
 * @author ran
 */
public class DisappearedNumbers_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            nums[Math.abs(nums[i])-1] = - Math.abs(nums[Math.abs(nums[i])-1]);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) ans.add(i+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,1};
        DisappearedNumbers_448 obj = new DisappearedNumbers_448();
        System.out.println(obj.findDisappearedNumbers(nums).toString());
    }
}
