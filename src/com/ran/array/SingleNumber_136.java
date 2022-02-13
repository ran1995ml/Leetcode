package com.ran.array;

/**
 * ClassName: SingleNumber_136
 * Description:
 * date: 2022/2/13 15:17
 *
 * @author ran
 */
public class SingleNumber_136 {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
