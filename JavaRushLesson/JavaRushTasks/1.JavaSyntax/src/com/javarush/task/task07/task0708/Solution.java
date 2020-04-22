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
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        ArrayList <String> list = new ArrayList(5);

        for (int i = 0; i < 5; i++) {
            String str = bufferedReader.readLine();
            if(i == 0)
                max = str.length();
            else if(max <= str.length()) max = str.length();
            list.add(str);
        }

        for (int i = 0; i < list.size(); i++) {
            if(max == list.get(i).length())
                System.out.println(list.get(i));
        }

    }
}
