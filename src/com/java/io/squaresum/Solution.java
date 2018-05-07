package com.java.io.squaresum;

public class Solution {

    public boolean judgeSquareSum(int c) {
        int r = mySqrt(c);
        for (int i = r; i >= 0; i--) {
            int left = c - i * i;
            if (isPerfectSquare(left)) {
                return true;
            }
        }
        return false;
    }

    public boolean isPerfectSquare(int num) {
        int r = mySqrt(num);
        return r * r == num;
    }

    public int mySqrt(int x) {
        System.out.println("mySqrt x = " + x);
        long r = x;
        while (r * r > x) {
            r = (r + x / r) / 2;
            System.out.println("mySqrt r = " + r + ",r * r  = " + r * r);
        }
        return (int) r;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("result:" + solution.judgeSquareSum(4));
        System.out.println("result:" + solution.judgeSquareSum(0));
        System.out.println("result:" + solution.judgeSquareSum(999999999));
    }
}
