package com.kl.easy;

/**
 * 最长公共前缀
 * @author: kl
 * @date: 2023/5/6  23:37
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
//        String[] strs = {"flower","flow","flight"};
        String[] strs = {"ab","a"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        char[] kl = strs[0].toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        for (int i = 0; i < kl.length; i++) {
            for (int i1 = 0; i1 < strs.length; i1++) {
                if(i>=strs[i1].toCharArray().length || kl[i] != strs[i1].toCharArray()[i]){
                    flag=false;
                    break;
                }
            }
            if (!flag){
                return sb.toString();
            }else{
                sb.append(kl[i]);
            }
        }
        return sb.toString();
    }
}
