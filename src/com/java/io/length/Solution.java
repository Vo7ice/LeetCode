package com.java.io.length;

public class Solution {

    public int lengthOfLastWord(String s) {
        if (s.trim().isEmpty()) {
            return 0;
        }
        String[] split = s.split(" ");
        return split[split.length - 1].length();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("a result:" + solution.lengthOfLastWord("a"));
        System.out.println("aba result:" + solution.lengthOfLastWord("aba"));
        System.out.println("' ' result:" + solution.lengthOfLastWord(" "));
        System.out.println("Hello World result:" + solution.lengthOfLastWord("Hello World"));

        String selection = "itemType" + " = ? " + " AND " + " title = ?";

        String position = "0,3";
        String[] filter;
        if (position.contains(",")) {
            filter = position.split(",");
            Integer.valueOf(filter[0]);
        } else {

        }
    }
}
