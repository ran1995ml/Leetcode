package com.ran.dp;

import java.util.Arrays;
import java.util.List;

/**
 * ClassName: WordBreak_139
 * Description:
 * date: 2022/2/16 7:06 下午
 *
 * @author ran
 */
public class WordBreak_139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for(int i=1;i<=s.length();i++){
            for(int j=s.length();j>=i;j--){
                if(wordDict.contains(s.substring(i-1,j))&&dp[i-1]){
                    dp[j] = true;
                }
                if(dp[s.length()]) return true;
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        WordBreak_139 obj = new WordBreak_139();
        String s = "leetcode";
        List<String> list = Arrays.asList("leet", "code");
        System.out.println(obj.wordBreak(s,list));
    }
}
