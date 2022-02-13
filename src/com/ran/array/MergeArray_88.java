package com.ran.array;

/**
 * ClassName: MergeArray_88
 * Description:
 * date: 2022/2/13 16:24
 *
 * @author ran
 */
public class MergeArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        for(int i=m+n-1;i>=0;i--){
            if(p1>=0&&p2>=0){
                nums1[i] = nums1[p1]>=nums2[p2]?nums1[p1--]:nums2[p2--];
            }else{
                nums1[i] = p1>=0?nums1[p1--]:nums2[p2--];
            }
        }
    }
}
