package com.ran.array;




/**
 * ClassName: RotateImage_48
 * Description:
 * date: 2022/2/14 2:56 下午
 *
 * @author ran
 */
public class RotateImage_48 {
    public void rotate(int[][] matrix) {
        rotate1(matrix);
        rotate2(matrix);
    }

    private void rotate2(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length-1-j];
                matrix[i][matrix[0].length-1-j] = temp;
            }
        }
    }

    private void rotate1(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
