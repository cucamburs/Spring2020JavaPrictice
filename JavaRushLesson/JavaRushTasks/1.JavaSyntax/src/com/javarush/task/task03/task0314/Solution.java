package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for(int i=1; i<=10; i++)
            for(int col=1; col<=10; col++)
                if(i!=1)
                    System.out.print(i*col);
                else System.out.print(i);
    }
}
