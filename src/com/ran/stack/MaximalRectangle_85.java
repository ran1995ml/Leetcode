package com.ran.stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * ClassName: MaximalRectangle_85
 * Description:
 * date: 2022/4/7 17:33
 *
 * @author ran
 */
public class MaximalRectangle_85 {

    public int maximalRectangle(int[][] matrix) {
        int max = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int[] heights = new int[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==1){
                    heights[j] += 1;
                }else{
                    heights[j] = 0;
                }
            }
            max = Math.max(max,maxRectangle(heights));
        }

        return max;
    }

    private int maxRectangle(int[] heights) {
        int max = 0;
        int[] arrays = new int[heights.length+2];
        System.arraycopy(heights,0,arrays,1,heights.length);
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i=1;i<arrays.length;i++){
            while (arrays[i]<arrays[stack.peek()]){
                int mid = stack.pop();
                int height = arrays[mid];
                int wide = i - stack.peek() - 1;
                max = Math.max(max,height*wide);
            }
            stack.push(i);
        }
        return max;
    }


    public static void main(String[] args) {
        int[][] matrix = {{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
        MaximalRectangle_85 obj = new MaximalRectangle_85();
        System.out.println(obj.maximalRectangle(matrix));
    }
}
