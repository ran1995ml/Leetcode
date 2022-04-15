package com.ran.dp;

/**
 * ClassName: MaxProfitII_122
 * Description:
 * date: 2022/4/15 14:07
 *
 * @author ran
 */
public class MaxProfitII_122 {
    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};
        MaxProfitII_122 obj = new MaxProfitII_122();
        System.out.println(obj.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        if(prices==null||prices.length<=1) return 0;
        int[][] dp = new int[prices.length][2];
        dp[0][1] = - prices[0];
        for(int i=1;i<prices.length;i++){
            dp[i][0] = Math.max(dp[i-1][1]+prices[i],dp[i-1][0]);
            dp[i][1] = Math.max(dp[i-1][0]-prices[i],dp[i-1][1]);
        }
        return dp[prices.length-1][0];
    }

    public int maxProfit1(int[] prices) {
        int ans = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]) ans += prices[i] - prices[i-1];
        }
        return ans;
    }
}
