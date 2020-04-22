package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashMap<String, String> Hmap = new HashMap(10);

        Hmap.put("арбуз", "ягода");
        Hmap.put("банан", "трава");
        Hmap.put("вишня", "ягода");
        Hmap.put("груша", "фрукт");
        Hmap.put("дыня", "овощ");
        Hmap.put("ежевика", "куст");
        Hmap.put("жень-шень", "корень");
        Hmap.put("земляника", "ягода");
        Hmap.put("ирис", "цветок");
        Hmap.put("картофель", "клубень");

        Iterator<HashMap.Entry<String, String>> iterator =  Hmap.entrySet().iterator();

        while(iterator.hasNext()){
            HashMap.Entry<String, String> pair = iterator.next();
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }

    }
}
