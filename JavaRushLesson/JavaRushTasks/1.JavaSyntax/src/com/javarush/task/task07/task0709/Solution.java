package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int min = 0;
        ArrayList <String> list = new ArrayList(5);

        for (int i = 0; i < 5; i++) {
            String str = bufferedReader.readLine();
            if(i == 0)
                min = str.length();
            else if(min >= str.length()) min = str.length();
            list.add(str);
        }

        for (int i = 0; i < list.size(); i++) {
            if(min == list.get(i).length())
                System.out.println(list.get(i));
        }

    }
}
