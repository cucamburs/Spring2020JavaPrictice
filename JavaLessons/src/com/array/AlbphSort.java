package com.array;
import java.util.Comparator;
import java.util.Scanner;

public class AlbphSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Input amount of the array elements: ");
        int array_size = scn.nextInt();
        String[] str_array = new String[array_size];

        for (int i = 0; i < array_size; i++) {
            System.out.println("Input " + (i+1) + " array element: ");
            str_array[i] = scn.nextLine();
        }

        System.out.print("The following array have been inputed: ");

        for (String each:str_array) {
            System.out.print("\"" + each + "\" ");
        }

    }

    String[] sort(String[] str_array){

        return str_array;
    }
}
