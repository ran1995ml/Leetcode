package com.ran.slidewindow;

/**
 * ClassName: MaxArea
 * Description:
 * date: 2022/2/14 6:40 下午
 *
 * @author ran
 */
public class MaxArea_11 {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left<right){
            int l = Math.min(height[left],height[right]);
            int r = right - left;
            if(height[left]<height[right]){
                left++;
            }else {
                right--;
            }
            max = Math.max(l*r,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        MaxArea_11 obj = new MaxArea_11();
        System.out.println(obj.maxArea(nums));
    }
}
