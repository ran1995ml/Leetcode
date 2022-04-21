package com.ran.dp;

/**
 * ClassName: MaxProduct_152
 * Description:
 * date: 2022/4/18 11:33
 *
 * @author ran
 */
public class MaxProduct_152 {
    public static void main(String[] args) {
        int[] nums = {-2,3,-4};
        MaxProduct_152 obj = new MaxProduct_152();
        System.out.println(obj.maxProduct(nums));
    }

    public int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int min = 1;
        int max = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                int temp = min;
                min = max;
                max = temp;
            }
            min = Math.min(min*nums[i],nums[i]);
            max = Math.max(max*nums[i],nums[i]);
            ans = Math.max(max,ans);
        }
        return ans;
    }

}
