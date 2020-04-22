package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.BatchUpdateException;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList <String> list = new ArrayList(10);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(i, reader.readLine());
        }
        int mas[] = max_min(list);
        if(mas[0] < mas[1]) System.out.println(list.get(mas[0]));
        else System.out.println(list.get(mas[1]));

    }

    public static int[] max_min(ArrayList <String> list){


        int mas[] = {0, 0};

        for (int i = 1; i < list.size(); i++) {
            if(list.get(mas[0]).length() > list.get(i).length()) mas[0] = i;
            else if(list.get(mas[1]).length() < list.get(i).length()) mas[1] = i;

        }
        return mas;
    }
}
