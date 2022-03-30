package com.ran.array;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * ClassName: ProductExceptSelf_238
 * Description:
 * date: 2022/2/22 4:36 下午
 *
 * @author ran
 */
public class ProductExceptSelf_238 {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = 1;
        for(int i=1;i<nums.length;i++){
            ans[i] = ans[i-1] * nums[i-1];
        }
        int res = 1;
        for(int i=nums.length-2;i>=0;i--){
            res *= nums[i+1];
            ans[i] = ans[i] * res;
        }
        return ans;
    }



    public static void main(String[] args) {
//        int[] nums = {1,2,3,4};
//        int[] nums1 = {-1,1,0,-3,3};
//        ProductExceptSelf_238 obj = new ProductExceptSelf_238();
//        System.out.println(Arrays.toString(obj.productExceptSelf(nums1)));
    }
}
