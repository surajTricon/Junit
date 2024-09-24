package com.tricon.poc;
import java.util.*;
public class StringCalc {
    public static int add(String num) {
        if (num.isEmpty()) {
            return 0;
        }
        num=num.replace("\n",",");
        String[] numberArray = num.split(",");
        int sum = 0;

        for (String numStr : numberArray) {
            int number = Integer.parseInt(numStr);
            if (number < 0) {
                throw new IllegalArgumentException("negatives are not allowed");
            }
            else if(number<=1000) {
            sum += number;
            }
        }
        return sum;
    }
    }