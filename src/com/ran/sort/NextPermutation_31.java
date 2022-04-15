package com.ran.sort;

import java.util.Arrays;

/**
 * ClassName: NextPermutation_31
 * Description:从末位查找第一个降序的元素，再从末位开始降序找到第一个比降序元素大的元素做交换
 * 交换之后反转数组
 * date: 2022/4/11 16:24
 *
 * @author ran
 */
public class NextPermutation_31 {
    public static void main(String[] args) {
//        int[] nums = {1,4,8,7,2,6,3,1};
        int[] nums = {1,5,1};
        System.out.println(Arrays.toString(nums));
        NextPermutation_31 obj = new NextPermutation_31();
        obj.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
    public void nextPermutation(int[] nums) {
        int index = nums.length - 2;
        while (index>=0){
            if(nums[index]<nums[index+1]) break;
            index--;
        }
        if(index==-1){
            reverse(nums,0,nums.length-1);
            return;
        }
        System.out.println(index);
        int i = nums.length - 1;
        while (nums[index]>=nums[i]){
            i--;
        }
        swap(nums,index,i);
        reverse(nums,index+1,nums.length-1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
