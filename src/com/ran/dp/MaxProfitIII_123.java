package com.ran.dp;

/**
 * ClassName: MaxProfitIII_123
 * Description:
 * date: 2022/4/18 11:21
 *
 * @author ran
 */
public class MaxProfitIII_123 {
    public static void main(String[] args) {
        MaxProfitIII_123 obj = new MaxProfitIII_123();
        int[] prices = {3,3,5,0,0,3,1,4};
        System.out.println(obj.maxProfit(prices));
    }
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length<=1) return 0;
        int[][] dp = new int[3][2];
        for(int i=0;i<prices.length;i++){
            for(int k=2;k>0;k--){
                if(i==0){
                    dp[k][1] = - prices[i];
                }else{
                    dp[k][0] = Math.max(dp[k][0],dp[k][1]+prices[i]);
                    dp[k][1] = Math.max(dp[k][1],dp[k-1][0]-prices[i]);
                }
            }
        }
        return dp[2][0];
    }
}
