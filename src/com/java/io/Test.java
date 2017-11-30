package com.java.io;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{2, 7, 13, 14};
        int target = 9;
        int[] ints = solution.twoNum(nums, target);
        System.out.println("ints:" + Arrays.toString(ints));
    }
}
