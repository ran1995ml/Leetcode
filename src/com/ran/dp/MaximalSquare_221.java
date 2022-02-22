package com.ran.dp;

/**
 * ClassName: MaximalSquare_221
 * Description:
 * date: 2022/2/22 5:42 下午
 *
 * @author ran
 */
public class MaximalSquare_221 {
    public int maximalSquare(char[][] matrix) {
        if(matrix==null||matrix.length==0) return 0;
        int max = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] dp = new int[row+1][col+1];
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(matrix[i-1][j-1]=='1'){
                    dp[i][j] = Math.min(Math.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1]) + 1;
                    max = Math.max(dp[i][j],max);
                }
            }
        }
        return max * max;
    }

    public static void main(String[] args) {
        char[][] matrix = {{'1','0','1','0','0'},
                           {'1','0','1','1','1'},
                           {'1','1','1','1','1'},
                           {'1','0','0','1','0'}};
        MaximalSquare_221 obj = new MaximalSquare_221();
        System.out.println(obj.maximalSquare(matrix));
    }
}
