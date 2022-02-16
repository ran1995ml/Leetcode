package com.ran.array;

import java.util.*;

/**
 * ClassName: GroupAnagrams_49
 * Description:
 * date: 2022/2/14 5:07 下午
 *
 * @author ran
 */
public class GroupAnagrams_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagrams_49 obj = new GroupAnagrams_49();
        System.out.println(obj.groupAnagrams(strs));
    }
}
