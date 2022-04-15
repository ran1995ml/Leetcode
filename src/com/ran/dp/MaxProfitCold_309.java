package com.ran.dp;

/**
 * ClassName: MaxProfitCold_309
 * Description:
 * date: 2022/4/15 15:56
 *
 * @author ran
 */
public class MaxProfitCold_309 {
    public static void main(String[] args) {
        int[] prices = {1,2,3,0,2};
        MaxProfitCold_309 obj = new MaxProfitCold_309();
        System.out.println(obj.maxProfit(prices));
    }
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length<=1) return 0;
        int[][] dp = new int[prices.length][2];
        dp[0][1] = - prices[0];
        dp[1][0] = Math.max(dp[0][1]+prices[1],dp[0][0]);
        dp[1][1] = Math.max(dp[0][1],dp[0][0]-prices[1]);
        for(int i=2;i<prices.length;i++){
            dp[i][1] = Math.max(dp[i-1][1],dp[i-2][0]-prices[i]);
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
        }
        return dp[prices.length-1][0];
    }
}
