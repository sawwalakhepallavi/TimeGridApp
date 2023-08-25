package com.bootcoding.util;

import java.util.Random;

public class DifficultyGenerator {
    public static String randomDifficulty(){
        Random random=new Random();
        String difficulty[]={"Hard","Medium","Easy"};
        int index=random.nextInt(difficulty.length);
        return difficulty[index];
    }

//    public static void main(String[] args) {
//        System.out.println(randomDifficulty());
//    }
}
