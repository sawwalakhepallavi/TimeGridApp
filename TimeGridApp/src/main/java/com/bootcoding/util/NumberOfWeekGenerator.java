package com.bootcoding.util;

import java.util.Random;

public class NumberOfWeekGenerator {
    public static int week()
    {
        Random random= new Random();
        int max=10;
        int min=1;
        int week = random.nextInt(max-min)+min;
//        System.out.println(week);
        return week;
    }
}
