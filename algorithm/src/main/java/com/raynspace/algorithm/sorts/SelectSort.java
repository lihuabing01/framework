package com.raynspace.algorithm.sorts;

import java.util.Arrays;

/**
 * Created by lihuabing on 2018/1/4.
 */
public class SelectSort {

    /**
     * 选择排序：每次选择最小或者最大的排在第一个
     * @param arr
     */
    public static void selectSort(int[] arr) {
        for(int i = 0,j = arr.length; i < j; i++) {
            for(int k = i + 1;k < j; k ++) {
                if(arr[i] > arr[k]) {
                    swap(arr,i,k);
                }
            }
        }
    }

    /**
     * 选择排序：每次选择最小或者最大的排在第一个
     * 优化：每次遍历比较时，如果匹配，则记录下标，避免每次匹配时都需要交换数据。
     * @param arr
     */
    public static void selectSort2(int[] arr) {
        for(int i = 0,j = arr.length; i < j; i++) {
            int min = i;
            for(int k = i + 1;k < j; k ++) {
                if(arr[i] > arr[k]) {
                    min = k;
                }
            }
            if(min != i) {
                swap(arr,i,min);
            }
        }
    }

    public static void swap(int[] arr,int idx1,int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,4,6,5,9,7,11,10,8,2};
        System.out.println("原数组为：     " + Arrays.toString(arr1) + ".");
        selectSort2(arr1);
        System.out.println("排序后的数组为：" + Arrays.toString(arr1) + ".");
    }
}
