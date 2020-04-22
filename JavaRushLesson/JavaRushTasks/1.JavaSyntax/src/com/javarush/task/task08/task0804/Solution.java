package com.javarush.task.task08.task0804;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Вывести на экран список ключей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>(10);
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printKeys(map);
    }
/*
    public static void printKeys(HashMap<String, String> map) {
        //напишите тут ваш код
        for (HashMap.Entry<String, String> pair : map.entrySet()){
            String key = pair.getKey();
            System.out.println(key);
        }

    }
*/
    public static void printKeys(HashMap<String, String> map) {
        //напишите тут ваш код
        Iterator<HashMap.Entry<String, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            HashMap.Entry<String, String> pair = iterator.next();
            String key  = pair.getKey();
            System.out.println(key);
        }

        }

    }
