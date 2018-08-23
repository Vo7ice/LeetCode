package com.java.io.climbing;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.toList;

public class Solution {


    public int climbStairs(int n) {

        return 0;
    }

    public static void main(String[] args) {
        List<CharSequence> mCharList = new ArrayList<>();
        mCharList.add("WhatsApp");
        mCharList.add("Facebook");
        mCharList.add("Facebook Messenger");
        mCharList.stream()
                .sorted(Comparator.comparing(CharSequence::toString))
                .collect(toList());
        mCharList.forEach(item -> {
            System.out.println("item = " + item);
        });

        List<Test> mTestList = new ArrayList<>();
        mTestList.add(new Test("liupangzi", 3));
        mTestList.add(new Test("liupangzi2",18));
        mTestList.add(new Test("liupan",90));
        Collections.sort(mTestList);
        mTestList.forEach(item -> System.out.println("test = " + item.toString()));

        System.out.println("result = " + isActivateSdcplus("ACTIVATE PoCService 00909"));
        System.out.println("result = " + isActivateSdcplusUpdate("ACTIVATE PoCService 909090868688683424324234"));
        System.out.println("round :" + roundStorageSize(64021856256l));
    }

    private static final String REGEX_ACTIVATE_SDCPLUS = "ACTIVATE PoCService *";
    private static final String REGEX_ACTIVATE_SDCPLUS_UPDATE = "ACTIVATE PoCService [0-9]{6,}";
    private static boolean isActivateSdcplus(String message) {
        return Pattern.matches(REGEX_ACTIVATE_SDCPLUS, message);
    }

    private static boolean isActivateSdcplusUpdate(String message) {
        return Pattern.matches(REGEX_ACTIVATE_SDCPLUS_UPDATE, message);
    }

    public static long roundStorageSize(long size) {
        long val = 1;
        long pow = 1;
        while ((val * pow) < size) {
            val <<= 1;
            if (val > 512) {
                val = 1;
                pow *= 1000;
            }
            System.out.println("roundStorageSize val = " + val + ",pow = " + pow);
        }
        return val * pow;
    }

    public static class Test implements Comparable<Test> {

        private String name;
        private int age;

        public Test(String name, int age) {
            this.name = name;
            this.age = age;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public int compareTo(@NotNull Test o) {
            return name.compareTo(o.getName());
        }

        @Override
        public String toString() {
            return "Test{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
