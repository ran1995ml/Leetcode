package com.ran.dp;

/**
 * ClassName: NumTrees_96
 * Description:dp[n]=dp[0]*dp[n-1-0]+dp[1]*dp[n-1-1]+...+dp[n-1]*dp[0]
 * date: 2022/4/18 17:26
 *
 * @author ran
 */
public class NumTrees_96 {
    public static void main(String[] args) {
        int n = 4;
        NumTrees_96 obj = new NumTrees_96();
        System.out.println(obj.numTrees(n));
    }

    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                dp[i] += dp[j] * dp[i-1-j];
            }
        }
        return dp[n];
    }
}
