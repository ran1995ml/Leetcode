package com.ran.dp;

import java.util.Arrays;

/**
 * ClassName: NumSquares_279
 * Description:
 * date: 2022/2/22 12:05 下午
 *
 * @author ran
 */
public class NumSquares_279 {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,n);
        dp[0] = 0;
        for(int i=1;i*i<=n;i++){
            for(int j=i*i;j<=n;j++){
                dp[j] = Math.min(dp[j-i*i]+1,dp[j]);
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        NumSquares_279 obj = new NumSquares_279();
        System.out.println(obj.numSquares(13));
    }
}
