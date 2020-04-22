package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class arrayLesson {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        int[] numeric_row = new int[7];
        int index = 0, count = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Input numeric sequence of 7 numbers thought a space: ");
        {
            String numString = scan.nextLine(), bufferStr = "";

            for (int i = 0; i < numString.length(); i++) {

                if (numString.charAt(i) != ' ')
                    bufferStr = bufferStr + String.valueOf(numString.charAt(i));
                else {
                    numeric_row[index++] = Integer.parseInt(bufferStr);
                    bufferStr = "";
                }

            }
            numeric_row[index++] = Integer.parseInt(bufferStr);
            bufferStr = "";
            // System.out.println(Arrays.toString(numeric_row));

        }
        {
            // Amount all the array elements
            int summ = 0;
            for (int i = 0; i < numeric_row.length; i++) {

                if (numeric_row[i] > 0) summ = summ + numeric_row[i];
            }
            System.out.println("Amount all positive numbers in array equal: " + summ);

        }


        { // stupid sort

            int[] copyArray = numeric_row;

            for (int i = 0; i < copyArray.length-1; i++) {
                count++;
                if (copyArray[i] > copyArray[i+1]) {
                    int buffer = copyArray[i];
                    copyArray[i] = copyArray[i+1];
                    copyArray[i+1] = buffer;
                    i = -1;
                }
            }
            System.out.println("Result of running the stupid algorithm is : " + Arrays.toString(copyArray) + " for " + count + " steps");
        }


        {   // array sort by a bubble

            int[] copyArray = numeric_row;
            int z = numeric_row.length-1;
            count = 0;
            for (int i = 0; i < z; i++) {
                count++;
                    if (copyArray[i] > copyArray[i+1]){
                        int buffer = copyArray[i];
                        copyArray[i] = copyArray[i+1];
                        copyArray[i+1] = buffer;
                    }
                    if (i == z-1){
                        --z;
                        i = -1;
                    }
            }
            System.out.println("Result of running the bubble algorithm is : " + Arrays.toString(copyArray) + " for " + count + " steps");
        }

        { // Shaikernaya sort

            int[] copyArray = numeric_row;
            int z = numeric_row.length-1;
            count = 0;
            for (int i = 0; i < z; i++) {
                int count_i = i+1;
                count++;
                if (copyArray[i] > copyArray[i+1]){
                    int buffer = copyArray[i];
                    copyArray[i] = copyArray[i+1];
                    copyArray[i+1] = buffer;
                }
                if (i == z-1){
                    --z;
                    for (; i > count_i; i--) {
                        count++;
                        if (copyArray[i] < copyArray[i+1]){
                            int buffer = copyArray[i];
                            copyArray[i] = copyArray[i+1];
                            copyArray[i+1] = buffer;
                        }
                    }
                }
            }
            System.out.println("Result of running the Shaikernaya algorithm is : " + Arrays.toString(copyArray) + " for " + count + " steps");
        }

        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("The block was running " + timeSpent + " msec");

    }
}
