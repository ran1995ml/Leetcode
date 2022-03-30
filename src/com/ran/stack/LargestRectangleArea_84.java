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
        int[] arr = new int[heights.length+2];
        System.arraycopy(heights,0,arr,1,heights.length);
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i=1;i<arr.length;i++){
            while (arr[i]<arr[stack.peek()]){
                int h = arr[stack.pop()];
                int w = i - stack.peek() - 1;
                max = Math.max(max,w*h);
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
