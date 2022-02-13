package com.ran.dp;

/**
 * ClassName: ClimbStairs_70
 * Description:
 * date: 2022/2/13 20:27
 *
 * @author ran
 */
public class ClimbStairs_70 {
    public int climbStairs(int n) {
        if(n<=2) return n;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
