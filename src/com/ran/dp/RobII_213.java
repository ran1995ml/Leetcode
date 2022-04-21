package com.ran.dp;

/**
 * ClassName: RobII_213
 * Description:
 * date: 2022/4/19 16:46
 *
 * @author ran
 */
public class RobII_213 {
    public static void main(String[] args) {
        int[] nums = {2,3,2};
        RobII_213 obj = new RobII_213();
        System.out.println(obj.rob(nums));
    }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        return Math.max(case1(nums),case2(nums));
    }

    private int case2(int[] nums) {
        int[] dp = new int[nums.length];
        dp[1] = nums[1];
        dp[2] = Math.max(nums[1],nums[2]);
        for(int i=3;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[nums.length-1];
    }

    private int case1(int[] nums) {
        int[] dp = new int[nums.length-1];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length-1;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[nums.length-2];
    }
}
