package com.java.io.lastword;

import com.java.io.utils.TimeUtils;

public class Solution {

    public int lengthOfLastWord(String s) {
        int indexOfSpace = s.lastIndexOf(' ');
        System.out.println("index:" + indexOfSpace);
        if (s.isEmpty()) {
            return 0;
        } else if (indexOfSpace == -1) {
            return s.length();
        } else {
            return s.length() - indexOfSpace - 1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("result:" + TimeUtils.getHumanRead(1522674269L));
        System.out.println("result:" + TimeUtils.getHumanRead(1522639415L));
        System.out.println("result:" + TimeUtils.getHumanRead(1522668215L));
    }
}
