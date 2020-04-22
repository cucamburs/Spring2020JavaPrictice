package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> Lint = new ArrayList<Integer>(10);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            Lint.add(i, Integer.parseInt(reader.readLine()));
        }
        System.out.println(Integer.toString(sequence(Lint)));
    }

    public static int sequence (List list){
        int max = 0, buffer = 0;
        for (Object i : list) {
            buffer = Collections.frequency(list, i);
            if (max < buffer) max = buffer;
        }

        return max;
    }
}