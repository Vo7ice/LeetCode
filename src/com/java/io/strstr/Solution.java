package com.java.io.strstr;

public class Solution {

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty() || haystack.equals(needle)) {
            return 0;
        } else {
            int stack = haystack.length(), needleLength = needle.length();
            for (int i = 0; i <= stack - needleLength; i++) {
                if (i + needleLength <= stack) {
                    String cutoff = haystack.substring(i, needleLength + i);
                    System.out.println("cutoff:" + cutoff);
                    if (cutoff.equals(needle)) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("result:" + solution.strStr("mississippi", "pi"));
    }
}
