package com.ran.dfs;

/**
 * ClassName: NumIslands_200
 * Description:
 * date: 2022/2/13 15:20
 *
 * @author ran
 */
public class NumIslands_200 {
    private int[][] direction = {{1,0},{-1,0},{0,1},{0,-1}};
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int sum = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,row,col,i,j);
                    sum++;
                }
            }
        }
        return sum;
    }
    private void dfs(char[][] grid,int row,int col,int i,int j){
        if(i<0||j<0||i>=row||j>=col||grid[i][j]=='0') return;
        grid[i][j] = '0';
        for(int[] dir:direction){
            dfs(grid,row,col,i+dir[0],j+dir[1]);
        }
    }
}
