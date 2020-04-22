package com.javarush.task.task08.task0827;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
      //  System.out.println(isDateOdd("MAY 1 2013"));
    }
/*
    public static boolean isDateOdd(String date) {

        char[] charDate = date.toCharArray();

        String Month, type = null, mmddyyyy;
        for (int i = 0; i < charDate.length; i++) {
            if(charDate[i] != ' ') {
                Month = Month + charDate[i];
                type = "MONTH";
            }
            else if (charDate[i] == ' ' && type.equals("MONTH")){
                type = "DAY";
                switch (Month){
                    case "JANUARY":
                        mmddyyyy = mmddyyyy + "01.";

                    case "FEBRUARY":
                        mmddyyyy = mmddyyyy + "02.";

                    case "MARCH":
                        mmddyyyy = mmddyyyy + "03.";

                    case "APREL":
                        mmddyyyy = mmddyyyy + "04.";

                    case "MAY":
                        mmddyyyy = mmddyyyy + "05.";

                    case "JUNE":
                        mmddyyyy = mmddyyyy + "06.";

                    case "JULY":
                        mmddyyyy = mmddyyyy + "07.";

                    case "AGUST":
                        mmddyyyy = mmddyyyy + "08.";

                    case "SEPTEMBER":
                        mmddyyyy = mmddyyyy + "09.";

                    case "OKTEBER":
                        mmddyyyy = mmddyyyy + "10.";

                    case "NOVEMBER":
                        mmddyyyy = mmddyyyy + "11.";

                    case "DECEMBER":
                        mmddyyyy = mmddyyyy + "12.";

                }

            }
            else if (charDate[i] == ' ' && type.equals("DAY"))

        }

        return true;

    }
    */
}
