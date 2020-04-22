package com.javarush.task.task08.task0816;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 11 1925"));
        map.put("Shvartsneger", new Date("DECEMBER 7 1981"));
        map.put("Merlin", new Date("JULY 1 1980"));
        map.put("Wocker", new Date("NOVEMBER 14 1974"));
        map.put("Strong", new Date("MAY 19 1995"));
        map.put("Van Dam", new Date("JUNE 17 1972"));
        map.put("Vasilieva", new Date("AUGUST 10 1997"));
        map.put("Petrov", new Date("FEBRUARY 15 1983"));
        map.put("Ivanooff", new Date("SEPTEMBER 21 1987"));
        map.put("Kuzmin", new Date("JULY 27 1982"));

        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        for (Map.Entry<String, Date> element : map.entrySet()) {
            if (element.getValue().getMonth() > 4 && element.getValue().getMonth() < 8) list.add(element.getKey());
        }
        for (int i = 0; i < list.size(); i++) {
            map.remove(list.get(i));
        }
/*
        for (Map.Entry<String, Date> element : map.entrySet()){
            System.out.println(element.getKey() + " " + element.getValue());
        }
*/


    }

    public static void main(String[] args) {
        removeAllSummerPeople(createMap());

    }
}
