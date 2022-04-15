package com.ran.dp;

/**
 * ClassName: maxProfit
 * Description:
 * date: 2022/4/15 12:07
 *
 * @author ran
 */
public class MaxProfit_121 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        MaxProfit_121 obj = new MaxProfit_121();
        System.out.println(obj.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }
            ans = Math.max(ans,prices[i]-min);
        }
        return ans;
    }
}
