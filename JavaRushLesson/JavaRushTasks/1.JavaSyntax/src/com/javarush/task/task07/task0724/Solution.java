package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human Pavel = new Human("Павел", true, 65);
        Human Katya = new Human("Катя", false, 55);
        Human Kolya = new Human("Коля", true, 74);
        Human Natasha = new Human("Наташа", false, 67);
        Human Michail = new Human("Михаил", true, 28, Kolya, Natasha);
        Human Anna = new Human("Аня", false, 25, Pavel, Katya);
        Human Igor = new Human("Игорь", true, 2, Michail, Anna);
        Human Oleg = new Human("Олег", true, 5, Michail, Anna);
        Human Olga = new Human("Оля", false, 7, Michail, Anna);

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex = false;
        int age = 0;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
            System.out.println(this.toString());
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
            System.out.println(this.toString());
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















