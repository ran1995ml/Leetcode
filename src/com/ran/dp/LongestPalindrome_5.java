package com.ran.dp;

/**
 * ClassName: LongestPalindrome_5
 * Description:
 * date: 2022/2/17 4:51 下午
 *
 * @author ran
 */
public class LongestPalindrome_5 {
    public String longestPalindrome(String s) {
        String str = "";
        int max = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for(int i=s.length()-1;i>=0;i--){
            for(int j=i;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)&&(j-i+1<=2||dp[i+1][j-1])){
                    dp[i][j] = true;
                    if(j-i+1>max){
                        max = j - i + 1;
                        str = s.substring(i,j+1);
                    }
                }
            }
        }
        return str;
    }
    public static void main(String[] args) {
        String s = "babad";
        LongestPalindrome_5 obj = new LongestPalindrome_5();
        System.out.println(obj.longestPalindrome(s));
    }
}
