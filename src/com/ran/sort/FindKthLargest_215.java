package com.ran.sort;

/**
 * ClassName: FindKthLargest_215
 * Description:
 * date: 2022/4/8 11:11
 *
 * @author ran
 */
public class FindKthLargest_215 {
    public static void main(String[] args) {
        int[] arrs = {1};
        FindKthLargest_215 obj = new FindKthLargest_215();
        System.out.println(obj.findKthLargest(arrs,1));
    }

    public int findKthLargest(int[] nums, int k) {
        k = nums.length - k;
        int left = 0;
        int right = nums.length - 1;
        while (left<=right){
            int i = quickSort(nums,left,right);
            if(i==k){
                return nums[k];
            }else if(i<k){
                left = i + 1;
            }else{
                right = i - 1;
            }
        }
        return -1;
    }

    private int quickSort(int[] nums, int left, int right) {
        int temp = nums[left];
        while (left<right){
            while (left<right&&nums[right]>=temp) right--;
            nums[left] = nums[right];
            while (left<right&&nums[left]<=temp) left++;
            nums[right] = nums[left];
        }
        nums[left] = temp;
        return left;
    }

}
