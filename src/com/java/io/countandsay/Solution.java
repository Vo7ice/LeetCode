package com.java.io.countandsay;


public class Solution {

    public String countAndSay(int n) {
        String result = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 1,count = 1; j <= result.length(); j++) {
                if (j == result.length() || result.charAt(j-1) != result.charAt(j)) {
                    sb.append(count);
                    sb.append(result.charAt(j-1));
                    count = 1;
                } else {
                    count++;
                }
            }
            result = sb.toString();
            //System.out.println("result:" + result+ ",n = " + i);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("result: at 1:" + solution.countAndSay(1));
        System.out.println("result: at 3:" + solution.countAndSay(3));
        System.out.println("result: at 7:" + solution.countAndSay(7));
        System.out.println("result: at 4:" + solution.countAndSay(4));
        System.out.println("result: at 9:" + solution.countAndSay(9));
    }
}
