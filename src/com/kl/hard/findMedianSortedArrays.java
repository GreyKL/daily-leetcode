package com.kl.hard;

/**
 * 寻找两个正序数组的中位数
 * @author: kl
 * @date: 2023/5/21  23:15
 */
public class findMedianSortedArrays {

    public static void main(String[] args) {
        int[] nums1= {};
        int[] nums2= {1};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = (nums1.length+nums2.length)/2+1;
        boolean fk = (nums1.length+nums2.length)%2==0;
        int db = 0;
        int k = 0;
        int l = 0;
        for (int j = 0; j < i; j++) {
            if(k < nums1.length && l < nums2.length ){
                if(nums1[k] >= nums2[l]){
                    if(fk){
                        if(j == i-2){
                            db = nums2[l];
                        }
                        if(j == i-1){
                            return (double)(db+nums2[l])/2;
                        }
                    }
                    if(!fk && j == i-1){
                        return nums2[l];
                    }
                    l++;
                }else{
                    if(!fk && j == i-1){
                        return nums1[k];
                    }
                    if(fk){
                        if(j == i-2){
                            db = nums1[k];
                        }
                        if(j == i-1){
                            return (double)(db+nums1[k])/2;
                        }
                    }
                    k++;
                }
            }else{
                if(k < nums1.length){
                    if(!fk && j == i-1){
                        return nums1[k];
                    }
                    if(fk){
                        if(j == i-2){
                            db = nums1[k];
                        }
                        if(j == i-1){
                            return (double)(db+nums1[k])/2;
                        }
                    }
                    k++;
                }else{
                    if(fk){
                        if(j == i-2){
                            db = nums2[l];
                        }
                        if(j == i-1){
                            return (double)(db+nums2[l])/2;
                        }
                    }
                    if(!fk && j == i-1){
                        return nums2[l];
                    }
                    l++;
                }
            }
        }
        return 0.0;
    }
}
