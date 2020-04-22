package com.javarush.task.task07.task0707;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList <String> List = new ArrayList();

   //     BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            List.add(Integer.toString(i));
        }
        System.out.println(Integer.toString(List.size()));

        for (int i = 0; i < List.size(); i++) {
            System.out.println(List.get(i));
        }
    }
}
