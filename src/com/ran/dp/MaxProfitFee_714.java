package com.ran.dp;

/**
 * ClassName: MaxProfitFee_714
 * Description:
 * date: 2022/4/15 16:11
 *
 * @author ran
 */
public class MaxProfitFee_714 {
    public static void main(String[] args) {
        int[] prices = {1, 3, 2, 8, 4, 9};
        int fee = 2;
        MaxProfitFee_714 obj = new MaxProfitFee_714();
        System.out.println(obj.maxProfit(prices,fee));
    }
    public int maxProfit(int[] prices, int fee) {
        if(prices==null||prices.length<=1) return 0;
        int[][] dp = new int[prices.length][2];
        dp[0][1] = - prices[0];
        for(int i=1;i<prices.length;i++){
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+prices[i]-fee);
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
        }
        return dp[prices.length-1][0];
    }
}
