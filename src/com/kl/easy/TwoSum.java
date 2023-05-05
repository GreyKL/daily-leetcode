package com.kl.easy;

import java.util.Arrays;

/**
 * 两数之和
 * @author: kl
 * @date: 2023/5/5  23:28
 */
public class TwoSum {

    public static void main(String[] args) {
        /*
        给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。

        你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

        你可以按任意顺序返回答案。
         */
        int[] nums = {2,7,11,15};
        int target = 26;
        int[] res = twoSum(nums,target);
        System.out.println(Arrays.toString(res));
    }

    /**
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int h = target-nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if(h==nums[j]){
                    return new int[]{nums[i],nums[j]};
                }
            }
        }
        throw new IllegalArgumentException("");
    }
}
