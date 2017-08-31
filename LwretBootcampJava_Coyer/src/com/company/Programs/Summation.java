package com.company.Programs;

public class Summation {

    public static String SumFrom1ToN(int n){
        int result = (n*(n+1))/2;
        String message = String.format("The summation of 1 to %d is %d", n, result);
        return message;
    }
}
