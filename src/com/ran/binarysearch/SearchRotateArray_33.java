package com.ran.binarysearch;

/**
 * ClassName: SearchRotateArray_33
 * Description:
 * date: 2022/2/17 5:26 下午
 *
 * @author ran
 */
public class SearchRotateArray_33 {
    public int search(int[] nums, int target) {
        if(nums==null||nums.length==0) return -1;
        int left = 0;
        int right = nums.length - 1;
        while (left<=right){
            int mid = left + (right - left) / 2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>nums[right]){
                if(nums[mid]>target&&target>=nums[left]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{
                if(nums[mid]<target&&target<=nums[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        SearchRotateArray_33 obj = new SearchRotateArray_33();
        System.out.println(obj.search(nums,2));
    }
}
