package com.javarush.task.task08.task0819;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        Iterator<Cat> iter = cats.iterator();
        cats.remove(iter.next());
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> cats = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            cats.add(new Cat());
        }
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat cat : cats){
            System.out.println(cats.toString());
        }

    }

    // step 1 - пункт 1
    public static class Cat{
        /*
        private String count = "cat";
        Cat(String a){
            this.count = this.count + " " + a;
        }
        */
    }
}
