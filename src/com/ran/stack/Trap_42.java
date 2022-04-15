package com.ran.stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * ClassName: Trap_42
 * Description:
 * date: 2022/3/24 7:30 下午
 *
 * @author ran
 */
public class Trap_42 {
    public int trap(int[] height) {
        int sum = 0;
        int[] left = new int[height.length];
        left[0] = height[0];
        for(int i=1;i<height.length;i++){
            left[i] = Math.max(left[i-1],height[i]);
        }
        int[] right = new int[height.length];
        right[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            right[i] = Math.max(right[i+1],height[i]);
        }
        for(int i=0;i<height.length;i++){
            sum += Math.min(left[i],right[i]) - height[i];
        }
        return sum;
    }

    public int trap1(int[] heights){
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<heights.length;i++){
            while (!stack.isEmpty()&&heights[i]>heights[stack.peek()]){
                int mid = stack.pop();
                if(stack.isEmpty()) break;
                int height = Math.min(heights[stack.peek()],heights[i]) - heights[mid];
                int wide = i - stack.peek() - 1;
                sum += height * wide;
            }
            stack.push(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Trap_42 obj = new Trap_42();
        int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(obj.trap(heights));
    }
}
