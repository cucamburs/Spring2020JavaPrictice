package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> BigArray = new ArrayList<Integer>(20) ;
        ArrayList<Integer> Small3Array = new ArrayList<Integer>(20);
        ArrayList<Integer> Small2Array = new ArrayList<Integer>(20);
        ArrayList<Integer> SmallOtherArray = new ArrayList<Integer>(20);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            BigArray.add(Integer.parseInt(reader.readLine()));
        }
        for (Integer element : BigArray){
            if (element % 3 == 0) Small3Array.add(element);
            if (element % 2 == 0) Small2Array.add(element);
            if (!(element % 3 == 0 || element % 2 == 0)) SmallOtherArray.add(element);
        }

        printList(Small3Array);
        printList(Small2Array);
        printList(SmallOtherArray);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (Integer element : list){
            System.out.println(Integer.toString(element));
        }
    }
}
