package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        ArrayList<String > max_long = new ArrayList<String>();

        max_long.add(list.get(0));


        for (int i = 1; i < list.size(); i++) {

            if(max_long.get(0).length() < list.get(i).length()) {

                max_long.clear();
                max_long.add(list.get(i));

            }
            else if(max_long.get(0).length() == list.get(i).length())
                max_long.add(list.get(i));
        }
        for (String element : max_long) {
            System.out.println(element);
        }
    }
}
