package com.ran.array;

/**
 * ClassName: MaxSubArray_53
 * Description:
 * date: 2022/2/12 23:29
 *
 * @author ran
 */
public class MaxSubArray_53 {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i< nums.length;i++){
            if(sum>0){
                sum += nums[i];
            }else {
                sum = nums[i];
            }
            max = Math.max(max,sum);
        }
        return max;
    }

}
