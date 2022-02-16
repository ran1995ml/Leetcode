package com.ran.dp;

import java.util.Arrays;

/**
 * ClassName: LengthOfLIS_300
 * Description:
 * date: 2022/2/16 6:38 下午
 *
 * @author ran
 */
public class LengthOfLIS_300 {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        int max = 1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[i]){
                    dp[j] = Math.max(dp[i]+1,dp[j]);
                }
            }
            max = Math.max(dp[i],max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,6,7,9,4,10,5,6};
        LengthOfLIS_300 obj = new LengthOfLIS_300();
        System.out.println(obj.lengthOfLIS(nums));
    }
}
