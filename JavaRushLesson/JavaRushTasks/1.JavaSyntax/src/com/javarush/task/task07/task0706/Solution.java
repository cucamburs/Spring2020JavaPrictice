package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int street[] = new int[15];
        int chet = 0, nonChet = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 15; i++) {
            street[i] = Integer.parseInt(bufferedReader.readLine());
            if(i % 2 == 0) chet = chet + street[i];
            else nonChet = nonChet + street[i];
        }

        if(chet > nonChet) System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");

    }
}
