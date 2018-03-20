package com.java.io.palindrome;

public class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else {
            int reverse = reverse(x);
            return x == 0 || (reverse != 0 && reverse == x);
        }
    }

    public int reverse(int x) {
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
        Solution solution = new Solution();
        System.out.println("isPalindrome:" + solution.isPalindrome(121));
        System.out.println("isPalindrome:" + solution.isPalindrome(230));
        System.out.println("isPalindrome:" + solution.isPalindrome(0));

    }
}
