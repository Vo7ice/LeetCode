package com.java.io.ServerN;

import java.util.ArrayList;
import java.util.List;

public class Triangle {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Integer[] arrays = triangle.getArrays(26);
        for (Integer array : arrays) {
            System.out.println("i:" + array);
        }
    }

    private Integer[] getArrays(int summary) {
        List<Integer> results = new ArrayList<>();
        int base = summary % 3;
        int sum = 0;
        while (base < summary && sum != summary) {
            base += 3;
            sum += base;
            results.add(base);
        }
        return results.toArray(new Integer[results.size()]);
    }

    private Integer[] getSerialArrays(int sum) {
        List<Integer> result = new ArrayList<>();
        int base = sum / 3;
        int left = sum % 3;

        return new Integer[0];
    }
}
