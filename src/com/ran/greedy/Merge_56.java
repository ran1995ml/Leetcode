package com.ran.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * ClassName: Merge_56
 * Description:
 * date: 2022/2/15 7:58 下午
 *
 * @author ran
 */
public class Merge_56 {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int[] inter:intervals){
            if(inter[0]<=end){
                end = Math.max(inter[1],end);
            }else {
                list.add(new int[]{start,end});
                start = inter[0];
                end = inter[1];
            }
        }
        list.add(new int[]{start,end});
        return list.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,4},{2,3}};
        Merge_56 obj = new Merge_56();
        System.out.println(Arrays.deepToString(obj.merge(intervals)));
    }
}
