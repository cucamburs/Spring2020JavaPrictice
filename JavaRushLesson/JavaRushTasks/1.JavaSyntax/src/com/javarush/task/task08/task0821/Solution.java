package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Иванов", "Василий");
        map.put("Иванов", "Исак");
        map.put("Петрова", "Екатерина");
        map.put("Мизулина", "Елена");
        map.put("Трамп", "Иванка");
        map.put("Абрамова", "Анна");
        map.put("Григорьев", "Игорь");
        map.put("Григорьева", "Елена");
        map.put("Морозова", "Светлана");
        map.put("Петрова", "Анна");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
