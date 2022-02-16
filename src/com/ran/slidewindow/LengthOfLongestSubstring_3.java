package com.ran.slidewindow;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: LengthOfLongestSubstring_3
 * Description:
 * date: 2022/2/14 4:35 下午
 *
 * @author ran
 */
public class LengthOfLongestSubstring_3 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        char[] ch = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int max = 0;
        while (right<ch.length){
            char c1 = ch[right];
            map.put(c1,map.getOrDefault(c1,0)+1);
            while (map.get(c1)>1){
                char c2 = ch[left];
                left++;
                map.put(c2,map.get(c2)-1);
            }
            max = Math.max(max,right-left+1);
            right++;
        }
        return max;
    }

    public static void main(String[] args) {
        LengthOfLongestSubstring_3 object = new LengthOfLongestSubstring_3();
        String s = "abcabcbb";
        System.out.println(object.lengthOfLongestSubstring(s));
    }
}
