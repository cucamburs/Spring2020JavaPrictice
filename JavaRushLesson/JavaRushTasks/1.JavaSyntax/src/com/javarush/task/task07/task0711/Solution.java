package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <String> list = new ArrayList(5);
        String buffer = null;

        //input strings to massive
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
         // rerecord massive's strings
        for (int i = 0; i < 13; i++) {
            buffer = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(0, buffer);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
