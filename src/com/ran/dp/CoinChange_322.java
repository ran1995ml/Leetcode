package com.ran.dp;

import java.util.Arrays;
import java.util.Map;

/**
 * ClassName: CoinChange_322
 * Description:
 * date: 2022/2/15 7:48 下午
 *
 * @author ran
 */
public class CoinChange_322 {
    public int coinChange(int[] coins, int amount) {
        if(amount==0) return 0;
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for(int i=0;i<coins.length;i++){
            for(int j=coins[i];j<=amount;j++){
                dp[j] = Math.min(dp[j-coins[i]]+1,dp[j]);
            }
        }
        return dp[amount]==amount+1?-1:dp[amount];
    }

    public static void main(String[] args) {
        CoinChange_322 obj = new CoinChange_322();
        int[] coins = {2};
        int target = 3;
        System.out.println(obj.coinChange(coins,target));
    }

}
