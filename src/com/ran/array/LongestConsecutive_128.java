package com.ran.array;

import java.util.HashSet;
import java.util.Set;

/**
 * ClassName: LongestConsecutive_128
 * Description:减少重复遍历
 * date: 2022/4/18 14:07
 *
 * @author ran
 */
public class LongestConsecutive_128 {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        LongestConsecutive_128 obj = new LongestConsecutive_128();
        System.out.println(obj.longestConsecutive(nums));
    }

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int maxLength = 0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]-1)) continue;
            int curLength = 0;
            int cur = nums[i];
            while(set.contains(cur)){
                cur++;
                curLength++;
            }
            maxLength = Math.max(curLength,maxLength);
        }
        return maxLength;
    }
}
