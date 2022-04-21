package com.ran.slidewindow;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * ClassName: MaxSlidingWindow_239
 * Description:
 * date: 2022/4/18 18:49
 *
 * @author ran
 */
public class MaxSlidingWindow_239 {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        MaxSlidingWindow_239 obj = new MaxSlidingWindow_239();
        System.out.println(Arrays.toString(obj.maxSlidingWindow(nums, k)));
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null||k<2) return nums;
        int[] ans = new int[nums.length-k+1];
        LinkedList<Integer> queue = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            while (!queue.isEmpty()&&nums[i]>nums[queue.peekLast()]){
                queue.pollLast();
            }
            queue.add(i);
            if(i-k+1>queue.getFirst()) queue.pollFirst();
            if(i-k+1>=0){
                ans[i-k+1] = nums[queue.getFirst()];
            }
        }
        return ans;
    }
}
