package com.ran.sort;

import java.util.Arrays;

/**
 * ClassName: SortColors_75
 * Description:
 * date: 2022/2/17 6:21 下午
 *
 * @author ran
 */
public class SortColors_75 {
    public void sortColors(int[] nums) {
        int p0 = 0;
        int p2 = nums.length - 1;
        int i = 0;
        while(i<=p2){
            if(nums[i]==0){
                swap(nums,i,p0);
                p0++;
                i++;
            }else if(nums[i]==2){
                swap(nums,i,p2);
                p2--;
            }else{
                i++;
            }
        }
    }

    private void swap(int[] nums,int i,int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        SortColors_75 obj = new SortColors_75();
        int[] nums = {2,0,2,1,1,0};
        int[] nums1 = {1,2,0};
        obj.sortColors(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
