package com.raynspace.algorithm.sorts;

import java.util.Arrays;

/**
 * Created by lihuabing on 2018/1/3.
 */
public class QuickSort {

    public static void quickSort(int[] arr,int left,int right) {
        dealPivot(arr,left,right);
        int newright = right - 1;
        while (newright > left) {
            dealPivot(arr,left,newright);
            int tempright = newright;
            while (tempright < right && arr[tempright] > arr[tempright + 1]) {
                swap(arr,tempright,tempright + 1);
                tempright = tempright + 1;
            }
            newright = newright - 1;
        }
    }

    public static void quickSort2(int[] arr,int left,int right) {
        if(left < right) {
            dealPivot(arr,left,right);
            int pivot = right - 1;
            int i = left;
            int j = right - 1;
            while (true) {
                while (arr[++i] < arr[pivot]) {}
                while (j > left && arr[--j] > arr[pivot]) {}
                if(i < j) {
                    swap(arr,i,j);
                } else {
                    break;
                }
            }
            if(i < right) {
                swap(arr,i,right - 1);
            }
            quickSort2(arr,left,i - 1);
            quickSort2(arr,i+1,right);
        }
    }

    public static void dealPivot(int[] arr,int left,int right) {
        int mid = (right + left) / 2;
        if(arr[left] > arr[mid]) {
            swap(arr,left,mid);
        }
        if (arr[left] > arr[right]) {
            swap(arr, left, right);
        }
        if(arr[right] < arr[mid]) {
            swap(arr,right,mid);
        }
        swap(arr,mid,right - 1);
    }

    public static void swap(int[] arr,int idx1,int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,4,6,5,9,7,11,10,8,2};
        System.out.println("原数组为：     " + Arrays.toString(arr1) + ".");
        quickSort2(arr1,0,arr1.length - 1);
        System.out.println("排序后的数组为：" + Arrays.toString(arr1) + ".");
    }

}
