package com.kl.easy;

/**
 * 删除有序数组中的重复项
 * @author: kl
 * @date: 2023/6/3  23:47
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        /*
        给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。然后返回 nums 中唯一元素的个数。
        考虑 nums 的唯一元素的数量为 k ，你需要做以下事情确保你的题解可以被通过：
        更改数组 nums ，使 nums 的前 k 个元素包含唯一元素，并按照它们最初在 nums 中出现的顺序排列。nums 的其余元素与 nums 的大小不重要。
        返回 k 。
         */
        int[] nums = {1,2,3};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length ==1) return 1;
        int k = 1;
        int l = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(l!=nums[i]){
                nums[k] = nums[i];
                k++;
                l = nums[i];
            }
        }
        return k;
    }

}
