package com.ran.array;

import static com.sun.tools.javac.jvm.ByteCodes.swap;

/**
 * ClassName: FindDuplicate_287
 * Description:
 * date: 2022/4/18 11:56
 *
 * @author ran
 */
public class FindDuplicate_287 {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        FindDuplicate_287 obj = new FindDuplicate_287();
        System.out.println(obj.findDuplicate(nums));
    }

    public int findDuplicate(int[] nums) {
        if(nums==null||nums.length<2) return 0;
        for(int i=0;i<nums.length;i++){
            while(i + 1 != nums[i]){
                if(nums[i]==nums[nums[i]-1]){
                    return nums[i];
                }else{
                    swap(nums,i,nums[i]-1);
                }
            }
        }
        return 0;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
