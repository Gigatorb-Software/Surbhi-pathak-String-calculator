package com.gigatorb.cal;

import java.util.Arrays;

public class cal {

    public static int add(String text) {
        if (text.equals("")) {
            return 0;
        } else {
            if(text.length() == 1){
                return Integer.parseInt(text);
            }
            else {

            }
                int sum = 0;
                String[] array = text.split(",");
                for (int i = 0; i < array.length; i++) {
                    sum += Integer.parseInt(array[i]);
                }


                return sum;

            }
        }


    }




