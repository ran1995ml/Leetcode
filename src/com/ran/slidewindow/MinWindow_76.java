package com.ran.slidewindow;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: MinWindow_76
 * Description:
 * date: 2022/4/12 15:04
 *
 * @author ran
 */
public class MinWindow_76 {
    public static void main(String[] args) {
        String s = "a";
        String t = "aa";
        MinWindow_76 obj = new MinWindow_76();
        System.out.println(obj.minWindow(s,t));
    }

    public String minWindow(String s, String t) {
        char[] sh = s.toCharArray();
        char[] th = t.toCharArray();
        Map<Character,Integer> needs = new HashMap<>();
        Map<Character,Integer> windows = new HashMap<>();
        for(char c:th){
            needs.put(c,needs.getOrDefault(c,0)+1);
        }
        int left = 0;
        int right = 0;
        int count = 0;
        int start = -1;
        int min = Integer.MAX_VALUE;
        while (right<sh.length){
            char c1 = sh[right];
            if(needs.containsKey(c1)){
                windows.put(c1,windows.getOrDefault(c1,0)+1);
                if(windows.get(c1).equals(needs.get(c1))) count++;
            }
            while (count==needs.size()){
                if(right-left+1<min){
                    min = right - left + 1;
                    start = left;
                }
                char c2 = sh[left];
                if(needs.containsKey(c2)){
                    windows.put(c2,windows.get(c2)-1);
                    if(windows.get(c2)<needs.get(c2)) count--;
                }
                left++;
            }
            right++;
        }
        return start==-1?"":s.substring(start,start+min);
    }
}
