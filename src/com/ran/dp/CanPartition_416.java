package com.ran.dp;

import java.util.Arrays;

/**
 * ClassName: CanPartition_416
 * Description:
 * date: 2022/4/14 11:06
 *
 * @author ran
 */
public class CanPartition_416 {
    public static void main(String[] args) {
        int[] nums = {14,9,8,4,3,2};
        CanPartition_416 obj = new CanPartition_416();
        System.out.println(obj.canPartition(nums));
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num:nums){
            sum += num;
        }
        if(sum%2>0) return false;
        int target = sum / 2;
        boolean[] dp = new boolean[target+1];
        dp[0] = true;
        for(int i=0;i<nums.length;i++){
            for(int j=target;j>=nums[i];j--){
                dp[j] = dp[j-nums[i]] || dp[j];
                if(dp[target]) return true;
            }
        }
        return dp[target];
    }
}
