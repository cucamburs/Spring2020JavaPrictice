package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> MMR = new ArrayList<String>();
        Collections.addAll(MMR, "мама", "мыла", "раму");

        MMR.add(1,"именно");
        MMR.add(3,"именно");
        MMR.add(5,"именно");

        for (String element : MMR)
            System.out.println(element);
    }
}
