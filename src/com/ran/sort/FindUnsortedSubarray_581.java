package com.ran.sort;

/**
 * ClassName: FindUnsortedSubarray_581
 * Description:
 * date: 2022/4/14 11:52
 *
 * @author ran
 */
public class FindUnsortedSubarray_581 {
    public static void main(String[] args) {
        int[] nums = {2,6,4,8,10,9,15};
        FindUnsortedSubarray_581 obj = new FindUnsortedSubarray_581();
        System.out.println(obj.findUnsortedSubarray(nums));
    }

    public int findUnsortedSubarray(int[] nums) {
        int start = 0;
        int end = 0;
        int max = nums[0];
        int min = nums[nums.length-1];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<max){
                end = i;
            }else{
                max = nums[i];
            }

            if(nums[nums.length-1-i]>min){
                start = nums.length - 1 - i;
            }else{
                min = nums[nums.length-1-i];
            }
        }
        return start==end?0:end-start+1;
    }
}
