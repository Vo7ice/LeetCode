package com.java.io.utils;

import java.util.Calendar;
import java.util.Date;

public class TimeUtils {

    public static String getHumanRead(Long time) {
        Date date = new Date(time * 1000);
        Date current = Calendar.getInstance().getTime();
        int timeInternal = (int) ((current.getTime() - date.getTime()) / 1000);
        String result;
        int temp;
        if (timeInternal < 60) {
            result = "刚刚";
        } else {
            temp = timeInternal / 60;
            if (temp < 60) {
                result = temp + "分钟前";
            } else {
                temp /= 60;
                if (temp < 24) {
                    result = temp + "小时前";
                } else {
                    temp /= 24;
                    if (temp < 30) {
                        result = temp + "天前";
                    } else {
                        temp /= 30;
                        if (temp < 12) {
                            result = temp + "月前";
                        } else {
                            temp /= 12;
                            result = temp + "年前";
                        }
                    }
                }
            }
        }
        return result;
    }
}