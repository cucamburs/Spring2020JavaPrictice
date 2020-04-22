package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Human EldestDaugthet = new Human();
        EldestDaugthet.name = "Elena";
        EldestDaugthet.sex = false;
        EldestDaugthet.age = 16;
        System.out.println(EldestDaugthet.toString());


        Human YoungestDaughter = new Human();
        YoungestDaughter.name = "Olga";
        YoungestDaughter.sex = false;
        YoungestDaughter.age = 14;
        System.out.println(YoungestDaughter.toString());


        Human Son = new Human();
        Son.name = "Alex";
        Son.sex = true;
        Son.age = 12;
        System.out.println(Son.toString());

        Human Mother = new Human();
        Mother.name = "Natasha";
        Mother.sex = false;
        Mother.age = 35;
        Mother.children.add(EldestDaugthet);
        Mother.children.add(YoungestDaughter);
        Mother.children.add(Son);
        System.out.println(Mother.toString());

        Human Father = new Human();
        Father.name = "Viktor";
        Father.sex = true;
        Father.age = 38;
        Father.children.add(Mother.children.get(0));
        Father.children.add(Mother.children.get(1));
        Father.children.add(Mother.children.get(2));
        System.out.println(Father.toString());


        Human GrandmotherMam = new Human();
        GrandmotherMam.name = "Anna";
        GrandmotherMam.sex = false;
        GrandmotherMam.age = 64;
        GrandmotherMam.children.add(Mother);
        System.out.println(GrandmotherMam.toString());


        Human GrandfatherMam = new Human();
        GrandfatherMam.name = "Alexander";
        GrandfatherMam.sex = true;
        GrandfatherMam.age = 69;
        GrandfatherMam.children.add(GrandmotherMam.children.get(0));
        System.out.println(GrandfatherMam.toString());

        Human GrandmotherDad = new Human();
        GrandmotherDad.name = "Svetlana";
        GrandmotherDad.sex = false;
        GrandmotherDad.age = 67;
        GrandmotherDad.children.add(Father);
        System.out.println(GrandmotherDad.toString());


        Human GrandfatherDad = new Human();
        GrandfatherDad.name = "Stepan";
        GrandfatherDad.sex = true;
        GrandfatherDad.age = 71;
        GrandfatherDad.children.add(GrandmotherDad.children.get(0));
        System.out.println(GrandfatherDad.toString());




    }

    public static class Human {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children = new ArrayList<Human>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
