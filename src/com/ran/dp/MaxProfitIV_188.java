package com.ran.dp;

/**
 * ClassName: MaxProfitIV_188
 * Description:
 * date: 2022/4/15 16:24
 *
 * @author ran
 */
public class MaxProfitIV_188 {
    public static void main(String[] args) {
        int[] prices = {3,2,6,5,0,3};
        int k = 4;
        MaxProfitIV_188 obj = new MaxProfitIV_188();
        System.out.println(obj.maxProfit(k,prices));
    }

    public int maxProfit(int k, int[] prices) {
        if(prices==null||prices.length<=1) return 0;
        if(k>=prices.length/2) return greedy(prices);
        int[][] dp = new int[k+1][2];
        for(int i=0;i<prices.length;i++){
            for(int j=k;j>0;j--){
                if(i==0){
                    dp[j][1] = - prices[i];
                }else{
                    dp[j][0] = Math.max(dp[j][0],dp[j][1]+prices[i]);
                    dp[j][1] = Math.max(dp[j][1],dp[j-1][0]-prices[i]);
                }
            }
        }
        return dp[k][0];
    }

    public int maxProfit1(int k, int[] prices) {
        if(prices==null||prices.length<=1) return 0;
        if(k>=prices.length/2) return greedy(prices);
        int[][][] dp = new int[prices.length][k+1][2];
        for(int i=0;i<prices.length;i++){
            for(int j=k;j>0;j--){
                if(i==0){
                    dp[i][j][1] = - prices[i];
                }else{
                    dp[i][j][0] = Math.max(dp[i-1][j][0],dp[i-1][j][1]+prices[i]);
                    dp[i][j][1] = Math.max(dp[i-1][j][1],dp[i-1][j-1][0]-prices[i]);
                }
            }
        }
        return dp[prices.length-1][k][0];
    }

    private int greedy(int[] prices) {
        int sum = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                sum += prices[i] - prices[i-1];
            }
        }
        return sum;
    }

}
