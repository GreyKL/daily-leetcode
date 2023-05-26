package com.kl.easy;

import java.util.HashMap;

/**
 * 存在重复元素
 * @author: kl
 * @date: 2023/5/26  14:57
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = {1,3,2,4};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> kl = new HashMap<>(nums.length);
        for (int num : nums) {
            if(kl.get(num)!=null){
                return true;
            }
            kl.put(num,num);
        }
        return false;
    }
}
