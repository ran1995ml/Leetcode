package com.ran.array;

/**
 * ClassName: SearchMatrix_240
 * Description:
 * date: 2022/2/13 14:56
 *
 * @author ran
 */
public class SearchMatrix_240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int i = 0;
        int j = col - 1;
        while(j>=0&&i<row){
            if(matrix[i][j]==target) return true;
            if(matrix[i][j]<target){
                i++;
            }else {
                j--;
            }
        }
        return false;
    }
}
