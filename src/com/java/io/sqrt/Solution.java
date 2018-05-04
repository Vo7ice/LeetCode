package com.java.io.sqrt;

public class Solution {

    public int mySqrt(int x) {
        System.out.println("mySqrt x = " + x);
        long r = x;
        while (r * r > x) {
            r = (r + x / r) / 2;
            System.out.println("mySqrt r = " + r + ",r * r  = " + r * r);
        }
        return (int) r;
    }

    public boolean isPerfectSquare(int num) {
        int r = mySqrt(num);
        return  r * r == num;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arrays = new int[]{4, 8, 16, 100, 1000, 2500};
        for (int item : arrays) {
            System.out.println("result: x = " + item + ",result = " + solution.mySqrt(item));
            System.out.println("result: x = " +item + ",perfect = " + solution.isPerfectSquare(item));
        }
    }
}
