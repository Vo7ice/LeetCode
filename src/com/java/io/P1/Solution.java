package com.java.io.P1;

public class Solution {

    public int[] twoNum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        System.out.println("The nums can`t meet the target!");
        return null;
    }

}
