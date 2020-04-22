package com.javarush.task.task06.task0613;

/* 
Кот и статика
VERNUT"SYA 6 level / 11 lesson

*/

public class Solution {
    public static void main(String[] args) {
        //создай 10 котов
         Cat cat[];
        for (int i = 0; i < 10; i++) {
          //  cat[i] = new Cat();
        }
        //выведи значение переменной catCount
        System.out.println(Cat.catCount);
    }

    public static class Cat {
        //создай статическую переменную catCount
        public static int catCount;

        //создай конструктор
        public Cat(){
            Cat.catCount++;
        }
    }
}
