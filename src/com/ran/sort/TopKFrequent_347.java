package com.ran.sort;

import java.util.*;

/**
 * ClassName: TopKFrequent_347
 * Description:
 * date: 2022/4/8 15:44
 *
 * @author ran
 */
public class TopKFrequent_347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1) - map.get(o2);
            }
        });
        int[] ans = new int[k];
        for(int key: map.keySet()){
            queue.add(key);
            if(queue.size()>k){
                queue.poll();
            }
        }
        while (!queue.isEmpty()){
            ans[k-1] = queue.poll();
            k--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        TopKFrequent_347 obj = new TopKFrequent_347();
        int[] ans = obj.topKFrequent(nums, 2);
        System.out.println(Arrays.toString(ans));
    }
}
