package com.ran.dfs;

/**
 * ClassName: WordSearch_79
 * Description:
 * date: 2022/2/12 16:56
 *
 * @author ran
 */
public class WordSearch_79 {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        boolean[] visited = new boolean[row*col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(dfs(board,visited,word,i,j,row,col,0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, boolean[] visited, String word, int i, int j, int row, int col, int index) {
        if(index==word.length()) return true;
        if(i<0||j<0||i>=row||j>=col||board[i][j]!=word.charAt(index)||visited[i*col+j]) return false;
        visited[i*col+j] = true;
        if(dfs(board,visited,word,i+1,j,row,col,index+1)||dfs(board,visited,word,i-1,j,row,col,index+1)
                ||dfs(board,visited,word,i,j+1,row,col,index+1)||dfs(board,visited,word,i,j-1,row,col,index+1))
            return true;
        visited[i*col+j] = false;
        return false;
    }
}
