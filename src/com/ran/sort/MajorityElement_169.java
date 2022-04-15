package com.ran.sort;

import java.util.Arrays;

/**
 * ClassName: MajorityElement_169
 * Description:
 * date: 2022/4/8 15:40
 *
 * @author ran
 */
public class MajorityElement_169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
