package com.gigatorb.cal;

import java.util.Arrays;

public class Cal {

    public int add(String text) throws Exception{
        if (text.equals("")) {
            return 0;
        } else {
            if (text.length() == 1) {
                return Integer.parseInt(text);
            }
        }
        int sum = 0;
        String negativeNumbers = "";
        boolean isNegativeFound = false;
        String[] array = text.split(",|\\;");
        for (int i = 0; i < array.length; i++) {
            int myNum = Integer.parseInt(array[i]);
            if(isNegative(myNum)){
                isNegativeFound = true;
                negativeNumbers = negativeNumbers+" "+myNum;
            }
                sum += Integer.parseInt(array[i]);
        }
        if(isNegativeFound){
            throw new Exception("negatives not allowed" + negativeNumbers);
        }
        return sum;
    }

    private boolean isNegative(int number){
        if(number < 0){
            return true;
        }
        return false;
    }
}
