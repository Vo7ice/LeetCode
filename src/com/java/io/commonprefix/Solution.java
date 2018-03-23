package com.java.io.commonprefix;

import java.util.Arrays;

// 找最大的前缀子串

/**
 * 先排序,最大前缀子串只存在第一个元素中.对第一个元素和最后一个元素进行匹配
 */
public class Solution {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if (null != strs && strs.length != 0) {
            Arrays.sort(strs);
            char[] a = strs[0].toCharArray();
            char[] b = strs[strs.length - 1].toCharArray();

            for (int i = 0; i < a.length; i++) {
                if (b.length > i && b[i] == a[i]) {
                    sb.append(b[i]);
                } else {
                    return sb.toString();
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
