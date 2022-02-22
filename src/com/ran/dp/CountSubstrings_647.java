package com.ran.dp;

/**
 * ClassName: CountSubstrings_647
 * Description:
 * date: 2022/2/22 11:46 上午
 *
 * @author ran
 */
public class CountSubstrings_647 {
    public int countSubstrings(String s) {
        int count = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for(int i=s.length()-1;i>=0;i--){
            for(int j=i;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)&&(j-i+1<=2||dp[i+1][j-1])){
                    dp[i][j] = true;
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountSubstrings_647 obj = new CountSubstrings_647();
        System.out.println(obj.countSubstrings("aaa"));
    }
}
