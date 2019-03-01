package com.raynspace.algorithm.sorts;

import java.util.Arrays;

/**
 * Created by lihuabing on 2018/1/4.
 */
public class InsertionSort {

    /**
     * 从待排序数组后依次抽取一个元素插入已排好序的数组中
     * @param arr
     */
    public static void insertionSort(int[] arr) {
        // i从1开始，小于 i 之前的元素为已排好序的。
        for(int i = 1,j = arr.length; i < j; i++) {
            int k = i;
            while(k > 0 && arr[k] < arr[k - 1]) {
                swap(arr,k,k - 1);
                k--;
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
        insertionSort(arr1);
        System.out.println("排序后的数组为：" + Arrays.toString(arr1) + ".");
    }
}
