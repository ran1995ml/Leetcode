package com.ran.sort;

import java.util.Arrays;

/**
 * ClassName: SortArray_912
 * Description:
 * date: 2022/4/7 18:04
 *
 * @author ran
 */
public class SortArray_912 {
    public static void main(String[] args) {
        int[] arrs = {5,1,1,2,0,0};
        SortArray_912 obj = new SortArray_912();
        System.out.println(Arrays.toString(obj.mergeSort(arrs)));
        System.out.println(Arrays.toString(arrs));
    }

    /**
     * 冒泡排序
     * @param arrs
     */
    public void bubbleSort(int[] arrs){
        for(int i=0;i<arrs.length-1;i++){
            for(int j=0;j<arrs.length-1-i;j++){
                if(arrs[j]>arrs[j+1]){
                    swap(arrs,j,j+1);
                }
            }
        }
    }

    /**
     * 快速排序
     * @param arrs
     * @param low
     * @param high
     */
    public void quickSort(int[] arrs,int low,int high){
        if(arrs.length<=0) return;
        if(low>=high) return;
        int left = low;
        int right = high;
        int temp = arrs[left];
        while (left<right){
            while (left<right&&arrs[right]>=temp){
                right--;
            }
            arrs[left] = arrs[right];
            while (left<right&&arrs[left]<=temp){
                left++;
            }
            arrs[right] = arrs[left];
        }
        arrs[left] = temp;
        quickSort(arrs,low,left-1);
        quickSort(arrs,left+1,high);
    }

    /**
     * 归并排序
     * @param arrs
     * @return
     */
    public int[] mergeSort(int[] arrs){
        if(arrs.length<=1) return arrs;
        int[] left = Arrays.copyOfRange(arrs,0,arrs.length/2);
        int[] right = Arrays.copyOfRange(arrs,arrs.length/2,arrs.length);
        return merge(mergeSort(left),mergeSort(right));
    }

    private int[] merge(int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[left.length+right.length];
        while(i<left.length&&j<right.length){
            ans[k++] = left[i]<right[j]?left[i++]:right[j++];
        }
        while (i<left.length){
            ans[k++] = left[i++];
        }
        while (j<right.length){
            ans[k++] = right[j++];
        }
        return ans;
    }

    /**
     * 堆排序
     * @param arrs
     */
    public void heapSort(int[] arrs){
        for(int i=arrs.length/2-1;i>=0;i--){
            adjustHeap(arrs,i,arrs.length);
        }
        for(int j=arrs.length-1;j>0;j--){
            swap(arrs,0,j);
            adjustHeap(arrs,0,j);
        }
    }

    private void adjustHeap(int[] arrs, int i, int length) {
        int temp = arrs[i];
        for(int k=2*i+1;k<length;k=k*2+1){
            if(k+1<length&&arrs[k+1]>arrs[k]){
                k++;
            }
            if(arrs[k]>temp){
                arrs[i] = arrs[k];
                i = k;
            }else{
                break;
            }
        }
        arrs[i] = temp;
    }


    private void swap(int[] arrs, int i, int j) {
        int temp = arrs[i];
        arrs[i] = arrs[j];
        arrs[j] = temp;
    }
}
