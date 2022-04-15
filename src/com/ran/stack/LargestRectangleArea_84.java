package com.ran.stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

/**
 * ClassName: LargestRectangleArea_84
 * Description:
 * date: 2022/3/24 7:44 下午
 *
 * @author ran
 */
public class LargestRectangleArea_84 {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        int[] arrays = new int[heights.length+2];
        Stack<Integer> stack = new Stack<>();
        System.arraycopy(heights,0,arrays,1,heights.length);
        stack.push(0);
        for(int i=1;i<arrays.length;i++){
            while (arrays[i]<arrays[stack.peek()]){
                int mid = stack.pop();
                int height = heights[mid];
                int wide = i - stack.peek() - 1;
                max = Math.max(max,wide*height);
            }
            stack.push(i);
        }
        return max;
    }


    public static void main(String[] args) {
        LargestRectangleArea_84 obj = new LargestRectangleArea_84();
        int[] heights = {2,1,5,6,2,3};
        System.out.println(obj.largestRectangleArea(heights));
    }
}
