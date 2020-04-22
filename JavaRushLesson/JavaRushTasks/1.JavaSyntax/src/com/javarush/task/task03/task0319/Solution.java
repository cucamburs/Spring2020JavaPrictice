package com.javarush.task.task03.task0319;
import java.io.*;
import static java.lang.System.in;

/*
Предсказание на будущее
*/




public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        String sSum = bufferedReader.readLine();
        String sYears = bufferedReader.readLine();
        int nSum = Integer.parseInt(sSum);
        int nYears = Integer.parseInt(sYears);

        System.out.println(name + " получает " + nSum + " через " + nYears + " лет.");

    }
}
