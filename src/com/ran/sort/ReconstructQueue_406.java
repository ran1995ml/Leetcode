package com.ran.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName: ReconstructQueue_406
 * Description:通常先按一个维度升序，按另一个维度降序简化问题
 * date: 2022/4/8 16:32
 *
 * @author ran
 */
public class ReconstructQueue_406 {
    public static void main(String[] args) {
        int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        ReconstructQueue_406 obj = new ReconstructQueue_406();
        System.out.println(Arrays.deepToString(obj.reconstructQueue(people)));
    }

    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]){
                    return o1[1] - o2[1];
                }
                return o2[0] - o1[0];
            }
        });
        List<int[]> ans = new LinkedList<>();
        for(int[] p:people){
            if(ans.size()<p[1]) ans.add(p);
            ans.add(p[1],p);
        }
        return ans.toArray(new int[0][2]);
    }
}
