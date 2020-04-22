package com.javarush.task.task08.task0815;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {


    public HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> MSet = new HashMap<String, String>(10);
        MSet.put("Vasiliev", "Sergey");
        MSet.put("Medvedev", "Anton");
        MSet.put("Vinokurova", "Dima");
        MSet.put("Stalin", "Iosif");
        MSet.put("Lenin", "Vladimer");
        MSet.put("Zukov", "Georgii");
        MSet.put("Yarovaya", "Irina");
        MSet.put("Mizulina", "Elena");
        MSet.put("Zirinovskii", "Vladimer");
        MSet.put("Medvedev", "Dima");
        return MSet;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int max = 0;
        for(String entry : map.values()){
            if (entry.equals(name)) max++;
        }


        return max;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int max = 0;
        for(String entry : map.keySet()){
            if (entry.equals(lastName)) max++;
        }

        return max;
    }

    public static void main(String[] args) {

      Solution obj = new Solution();

      obj.getCountTheSameFirstName(obj.createMap(), "Medvedev");
      obj.getCountTheSameLastName(obj.createMap(), "Dima");

    }
}
