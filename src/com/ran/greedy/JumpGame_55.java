package com.ran.greedy;

/**
 * ClassName: JumpGame_55
 * Description:
 * date: 2022/2/17 6:20 下午
 *
 * @author ran
 */
public class JumpGame_55 {
    public boolean canJump(int[] nums) {
        if(nums==null||nums.length==0) return false;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(i>max) return false;
            max = Math.max(max,i+nums[i]);
        }
        return max>=nums.length-1;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,3,1,1,4};
        int[] nums2 = {2,3,1,1,4};
        JumpGame_55 obj = new JumpGame_55();
        System.out.println(obj.canJump(nums2));
    }
}
