package com.ran.binarysearch;

import java.util.Arrays;

/**
 * ClassName: SearchRange_34
 * Description:
 * date: 2022/2/15 7:03 下午
 *
 * @author ran
 */
public class SearchRange_34 {
    public int[] searchRange(int[] nums, int target) {
        int index1 = -1;
        int index2 = -1;
        if(nums==null||nums.length==0) return new int[]{index1,index2};
        int left = 0;
        int right = nums.length;
        while (left<right){
            int mid = left + (right - left) / 2;
            if(nums[mid]>=target){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        if(left<nums.length&&nums[left]==target) index1 = left;
        right = nums.length;
        while (left<right){
            int mid = left + (right - left) / 2;
            if(nums[mid]>target){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        if(left-1>=0&&nums[left-1]==target) index2 = left - 1;
        return new int[]{index1,index2};
    }

    public static void main(String[] args) {
        SearchRange_34 obj = new SearchRange_34();
        int[] nums = {1};
        int target = 0;
        System.out.println(Arrays.toString(obj.searchRange(nums, target)));
    }
}
