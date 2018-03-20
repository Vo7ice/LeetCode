package com.java.io.roamtoint;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int romanToInt(String s) {
        Map<Character, Integer> roamTable = prepareMap();
        int sum = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            char c = s.charAt(i);
            if (roamTable.containsKey(c)) {
                int num = roamTable.get(c);
                System.out.println("num:" + num + ",sum:" + sum);
                if (sum >= num) {
                    sum += num;
                } else {
                    sum = num - sum;
                }
            }
        }
        return sum;
    }

    /*I - 1
      V - 5
      X - 10
      L - 50
      C - 100
      D - 500
      M - 1000*/
    private Map<Character, Integer> prepareMap() {
        Map<Character, Integer> table = new HashMap<>();
        table.put('I', 1);
        table.put('V', 5);
        table.put('X', 10);
        table.put('L', 50);
        table.put('C', 100);
        table.put('D', 500);
        table.put('M', 1000);
        return table;
    }

    /*public static int romanToInt2(String s) {
        if (s == null || s.length() == 0)
            return -1;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int len = s.length(), result = map.get(s.charAt(len - 1));
        for (int i = len - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1)))
                result += map.get(s.charAt(i));
            else
                result -= map.get(s.charAt(i));
        }
        return result;
    }*/

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("the IV result:" + solution.romanToInt("IV"));
        System.out.println("the XL result:" + solution.romanToInt("XL"));
        System.out.println("the CD result:" + solution.romanToInt("CD"));
        System.out.println("the CM  result:" + solution.romanToInt("CM"));
        System.out.println("the III  result:" + solution.romanToInt("III"));
        System.out.println("the IIIV  result:" + solution.romanToInt("VIII"));
        System.out.println("the DCXXI  result:" + solution.romanToInt("DCXXI"));
        System.out.println("the MCMXCVI  result:" + solution.romanToInt("MCMXCVI"));
    }
}
