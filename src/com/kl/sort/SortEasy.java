package com.kl.sort;

import java.util.Arrays;

/**
 * java几种简单排序算法
 * @author: kl
 * @date: 2023/5/7  19:24
 */
public class SortEasy {

    public static void main(String[] args) {
        int[] arr = {1,4,6,2,9,0,4,5,7,3,43,464,3244,64,5,3,2,3,654,343,566,745};
        System.out.println(Arrays.toString(bubbleSortOpt(arr)));
    }

    /**
     * 交换排序 - 冒泡排序
     *      冒泡排序是一种简单的交换排序算法，以升序排序为例，其核心思想是：
     *     从第一个元素开始，比较相邻的两个元素。如果第一个比第二个大，则进行交换。
     *     轮到下一组相邻元素，执行同样的比较操作，再找下一组，直到没有相邻元素可比较为止，此时最后的元素应是最大的数。
     *     除了每次排序得到的最后一个元素，对剩余元素重复以上步骤，直到没有任何一对元素需要比较为止。
     * @param arr
     * @return
     */
    public static int[] bubbleSortOpt(int[] arr){
        int temp =0;
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * 交换排序 - 快速排序
     * 快速排序的思想很简单，就是先把待排序的数组拆成左右两个区间，左边都比中间的基准数小，右边都比基准数大。
     * 接着左右两边各自再做同样的操作，完成后再拆分再继续，一直到各区间只有一个数为止。
     * @param arr
     * @return
     */
    public static int[] quicksort(int[] arr,int start, int end){
        if(start < end) {
            // 把数组中的首位数字作为基准数
            int stard = arr[start];
            // 记录需要排序的下标
            int low = start;
            int high = end;
            // 循环找到比基准数大的数和比基准数小的数
            while(low < high) {
                // 右边的数字比基准数大
                while(low < high && arr[high] >= stard) {
                    high--;
                }
                // 使用右边的数替换左边的数
                arr[low] = arr[high];
                // 左边的数字比基准数小
                while(low < high && arr[low] <= stard) {
                    low++;
                }
                // 使用左边的数替换右边的数
                arr[high] = arr[low];
            }
            // 把标准值赋给下标重合的位置
            arr[low] = stard;
            // 处理所有小的数字
            quicksort(arr, start, low);
            // 处理所有大的数字
            quicksort(arr, low + 1, end);
        }
        return arr;
    }
}
