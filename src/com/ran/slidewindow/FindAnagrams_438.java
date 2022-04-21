package com.ran.slidewindow;

import java.util.*;

/**
 * ClassName: FindAnagrams_438
 * Description:
 * date: 2022/4/20 16:35
 *
 * @author ran
 */
public class FindAnagrams_438 {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        FindAnagrams_438 obj = new FindAnagrams_438();
        System.out.println(obj.findAnagrams(s,p));
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        char[] sh = s.toCharArray();
        char[] ph = p.toCharArray();
        int right = 0;
        int left = 0;
        int[] windows = new int[26];
        int[] needs = new int[26];
        for(char c:ph){
            needs[c-'a']++;
        }
        while (right<sh.length){
            char c = sh[right];
            if(needs[c-'a']>0) windows[c-'a']++;

            if(right-left==ph.length-1){
                if(Arrays.equals(windows, needs)) ans.add(left);
                if(needs[sh[left]-'a']>0) windows[sh[left]-'a']--;
                left++;
            }

            right++;
        }
        return ans;

    }
}
