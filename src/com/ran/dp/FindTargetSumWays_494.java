package com.ran.dp;

import java.util.Arrays;

/**
 * ClassName: FindTargetSumWays_494
 * Description:01背包问题
 * date: 2022/4/12 19:51
 *
 * @author ran
 */
public class FindTargetSumWays_494 {
    public static void main(String[] args) {
        int[] nums = {1,0};
        int target = 1;
        FindTargetSumWays_494 obj = new FindTargetSumWays_494();
        System.out.println(obj.findTargetSumWays(nums,target));
    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int num:nums){
            sum += num;
        }
        int ans = (sum + target) / 2;
        if(ans<0||ans>sum||(sum+target)%2>0) return 0;
        int[] dp = new int[ans+1];
        dp[0] = 1;
        for(int i=0;i<nums.length;i++){
            for(int j=ans;j>=nums[i];j--){
                dp[j] += dp[j-nums[i]];
            }
        }
        return dp[ans];
    }
}
