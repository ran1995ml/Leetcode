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
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }
        rightMax[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1],height[i]);
        }
        int sum = 0;
        for(int i=0;i<height.length;i++){
            sum += Math.min(leftMax[i],rightMax[i]) - height[i];
        }
        return sum;
    }

    public int trap1(int[] height){
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<height.length;i++){
            while (!stack.isEmpty()&&height[i]>height[stack.peek()]){
                int mid = stack.pop();
                if(stack.isEmpty()) break;
                int left = stack.peek();

            }
            stack.push(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Trap_42 obj = new Trap_42();
        int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(obj.trap1(heights));
    }
}
