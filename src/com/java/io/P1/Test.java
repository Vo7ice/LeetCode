package com.java.io.P1;

import java.util.Arrays;
import java.util.Objects;

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{2, 7, 13, 14};
        int target = 27;
        int[] ints = solution.twoNum(nums, target);
        System.out.println("ints:" + Arrays.toString(ints));
        String model = "HTC 2Q5V1";
        model = model.replace(" ", "_");
        System.out.println("model:" + model);
        String str1 = "com.htc.home";
        String str2 = "com.htc.home";
        System.out.println(Objects.equals(str1, str2));
    }
}
