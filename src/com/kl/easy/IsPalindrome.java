package com.kl.easy;

/**
 * 回文数
 * @author: kl
 * @date: 2023/5/6  16:55
 */
public class IsPalindrome {

    public static void main(String[] args) {
        /*
        给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
        回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
        例如，121 是回文，而 123 不是。
         */
        int x = 1073773701;
        System.out.println(isPalindrome1(x));
    }

    public static boolean isPalindrome(int x) {
        if(x<0) return false;
        String kl = String.valueOf(x);
        char[] j = kl.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = j.length-1; i >= 0; i--) {
            sb.append(j[i]);
        }
        long y = Long.parseLong(sb.toString());
        long l = (long)x*2;
        return y+x==l;
    }


    public static boolean isPalindrome1(int x) {
        if(x < 0)
            return false;
        int cur = 0;
        int num = x;
        while(num != 0) {
            int k = num % 10;
            int l = cur * 10;
            cur = l + k;
            num /= 10;
        }
        return cur == x;
    }

}
