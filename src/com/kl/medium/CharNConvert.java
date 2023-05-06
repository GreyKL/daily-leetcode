package com.kl.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * N 字形变换
 * @author: kl
 * @date: 2023/5/6  9:39
 */
public class CharNConvert {

    public static void main(String[] args) {
        /*
        将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
        比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
        P   A   H   N
        A P L S I I G
        Y   I   R
        之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
        请你实现这个将字符串进行指定行数变换的函数：
         */
        String s = "PAYPALISHIRING";
        int numRows = 4;
        System.out.println(convert2(s,numRows));
    }

    //todo N字形变换
    public static String convert(String s, int numRows) {
        if(numRows < 2) return s;
        if(s.length() < numRows) return s;

        char[] kl = s.toCharArray();
        char[][] two = new char[numRows][4];
        return null;
    }


    public static String convert2(String s, int numRows) {

        if(numRows < 2) return s;

        List<StringBuilder> rows = new ArrayList<StringBuilder>();

        for(int i = 0; i < numRows; i++) rows.add(new StringBuilder());

        int i = 0, flag = -1;

        for(char c : s.toCharArray()) {

            rows.get(i).append(c);

            if(i == 0 || i == numRows -1) flag = - flag;

            i += flag;

        }

        StringBuilder res = new StringBuilder();

        for(StringBuilder row : rows) res.append(row);

        return res.toString();

    }

}
