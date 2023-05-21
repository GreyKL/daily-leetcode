package com.kl.medium;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/**
 * 无重复字符的最长子串
 * @author: kl
 * @date: 2023/5/12  10:28
 */
public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        /*
        给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
        输入: s = "abcabcbb"
        输出: 3
        解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
         */
//        String s ="abcabcbb";
//        String s ="pwwkew";
//        String s ="bbbbb";
//        String s ="dvdf";
        String s ="abba";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        if(s== null || s.length() == 0) return 0;
        char[] sc = s.toCharArray();
        int max = 1;
        int start = 0;
        Map<Character,Integer> isExist = new HashMap<>();
        for (int i = 0; i < sc.length; i++) {
            if(isExist.get(sc[i]) != null ){
                start = Math.max(start, isExist.get(sc[i]) + 1);
            }
            if(max < (i - start+1)){
                max = i - start+1;
            }
            isExist.put(sc[i],i);
        }
        return max;
    }
}
