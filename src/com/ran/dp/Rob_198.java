package com.ran.dp;

/**
 * ClassName: Rob_198
 * Description:
 * date: 2022/4/19 16:33
 *
 * @author ran
 */
public class Rob_198 {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        Rob_198 obj = new Rob_198();
        System.out.println(obj.rob(nums));
    }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[nums.length-1];
    }
}
