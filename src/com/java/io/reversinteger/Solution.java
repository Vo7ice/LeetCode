package com.java.io.reversinteger;

public class Solution {
    public int reverse(int x) {
//        System.out.println("max:" + Integer.MAX_VALUE);
        long ret = 0;
        while (x != 0) {
            ret = ret * 10 + x % 10;
            x = x / 10;
            if (ret > Integer.MAX_VALUE || ret < Integer.MIN_VALUE) {
                System.out.println("not available!");
                return 0;
            }
        }
        return (int) ret;
    }

    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println("123 revert:" + sl.reverse(123));
        System.out.println("-123 revert:" + sl.reverse(-123));
        System.out.println("120 revert:" + sl.reverse(120));
        System.out.println("2300000 revert:" + sl.reverse(2300000));
    }
}
