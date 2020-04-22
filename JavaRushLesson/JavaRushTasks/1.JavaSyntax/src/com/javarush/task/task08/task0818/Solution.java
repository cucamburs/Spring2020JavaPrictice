package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> Richer = new HashMap<String, Integer>();
        Richer.put("Geits", 15000000);
        Richer.put("Tsukinberg", 3000000);
        Richer.put("Bordzov", 12000);
        Richer.put("Ivanov", 350);
        Richer.put("Peskov", 100000);
        Richer.put("Petrov", 150);
        Richer.put("Kravchuk",524);
        Richer.put("Michalkov",80);
        Richer.put("Mizurina",500);
        Richer.put("Mutko",450);

        return Richer;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> item : copy.entrySet()){
            if (item.getValue() < 500)
                map.remove(item.getKey());
        }

/*
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
*/

    }

    public static void main(String[] args) {
        removeItemFromMap(createMap());
    }
}