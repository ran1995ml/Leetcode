package com.ran.array;

/**
 * ClassName: ClimbStairs70
 * Description:爬楼梯
 * date: 2021/12/14 23:07
 *
 * @author ran
 */
public class ClimbStairs70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(20));
    }
    public static int climbStairs(int n) {
        if(n<=2) return n;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
