package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> MSet = new HashMap<String, String>(11);
        MSet.put("Vasiliev", "Sergey");
        MSet.put("Medvedev", "Anton");
        MSet.put("Vinokurova", "Dima");
        MSet.put("Stalin", "Iosif");
        MSet.put("Lenin", "Vladimer");
        MSet.put("Zukov", "Georgii");
        MSet.put("Yarovaya", "Elena");
        MSet.put("Mizulina", "Elena");
        MSet.put("Zirinovskii", "Vladimer");
        MSet.put("Medvedeva", "Elena");
        return MSet;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<String, String>(map);
        HashMap<String, String> copy1 = new HashMap<String, String>(map);

        for (String pair : copy.values()){
            int count = 0;
            for (String duplecate : copy1.values())
                if (pair.equals(duplecate)) {
                    count++;
                    if (count == 2)
                        removeItemFromMapByValue(map, pair);
                }

        }
        /*
        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        */
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());

    }
}
