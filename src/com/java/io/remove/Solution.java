package com.java.io.remove;

public class Solution {

    public int removeDuplicates(int[] nums) {
        int result = 0;
        if (null == nums) {
            result = 0;
        } else if (nums.length == 1) {
            result = 1;
        } else {
            result = 1;
            int temp = nums[0];
            for (int num : nums) {
                if (num != temp) {
                    temp = num;
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("112--result:" + solution.removeDuplicates(new int[]{1,1,2}));
        System.out.println("112233456678--result:" + solution.removeDuplicates(new int[]{1,1,2,2,3,3,4,5,6,6,7,8}));
    }
}
