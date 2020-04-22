package com.javarush.task.task08.task0814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() throws IOException {
        //напишите тут ваш код
        HashSet<Integer> Sint = new HashSet<Integer>(20);
       // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
       //     Sint.add(Integer.parseInt(reader.readLine()));
            Sint.add(i);
        }
        return Sint;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        Set <Integer> SetRemove = new HashSet<Integer>();
        for (Integer element : set){
            if (element > 10) SetRemove.add(element);
        }

        set.removeAll(SetRemove);
        return set;
    }

    public static void main(String[] args) throws IOException {
        removeAllNumbersMoreThan10(createSet());
    }
}
