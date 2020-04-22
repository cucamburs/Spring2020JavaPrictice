package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код


        System.out.println(convertEurToUsd(250, 1.786));

        System.out.println(convertEurToUsd(4000, 1.73334));
    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш ко
        return eur*course;
    }
}
