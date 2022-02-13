package com.ran.array;

/**
 * ClassName: MoveZeroes
 * Description:
 * date: 2022/2/13 15:45
 *
 * @author ran
 */
public class MoveZeroes_283 {
    public void moveZeroes(int[] nums) {
        int p1 = 0;
        int p2 = 0;
        int count = 0;
        while (p2<nums.length){
            if(nums[p2]==0){
                count++;
            }else{
                nums[p1++] = nums[p2];
            }
            p2++;
        }
        while (p1<nums.length){
            nums[p1++] = 0;
        }
    }
}
