package com.java.io.searchinsert;

public class Solution {

    public int searchInsert(int[] nums, int target) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) {
                result = i;
                return result;
            } else {
                result = i;
            }
        }
        return result + 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("result:" + solution.searchInsert(new int[]{1,3,5,6},5));
        System.out.println("result:" + solution.searchInsert(new int[]{1,3,5,6},2));
        System.out.println("result:" + solution.searchInsert(new int[]{1,3,5,6},0));
        System.out.println("result:" + solution.searchInsert(new int[]{1,3,5,6},7));
    }
}
