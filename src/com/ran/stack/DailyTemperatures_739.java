package com.ran.stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * ClassName: DailyTemperatures_739
 * Description:
 * date: 2022/3/22 8:03 下午
 *
 * @author ran
 */
public class DailyTemperatures_739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=temperatures.length-1;i>=0;i--){
            while (!stack.isEmpty()&&temperatures[i]>=temperatures[stack.peek()]){
                stack.pop();
            }
            ans[i] = stack.isEmpty()?0:stack.peek()-i;
            stack.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        DailyTemperatures_739 obj = new DailyTemperatures_739();
        int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(obj.dailyTemperatures(temperatures)));
    }
}
