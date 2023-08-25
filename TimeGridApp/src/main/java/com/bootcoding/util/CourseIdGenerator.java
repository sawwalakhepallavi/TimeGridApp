package com.bootcoding.util;

import java.util.Random;

public class CourseIdGenerator {
    public static int courseId()
    {
        Random random= new Random();
        int min=1;
        int max=4;
        return random.nextInt(max-min)+min;
    }
//    public static void main(String[] args) {
//        System.out.println(courseId());
//    }

}
