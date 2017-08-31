package com.company.Programs;

import java.util.Scanner;

public class SummationOrProduct {

    private static Scanner scanner;

    public static String GetOperation(){
        scanner = new Scanner(System.in);
        System.out.println("Would you like to see the summation or product of a set from 1 to n?");
        String response = scanner.nextLine();
        if(response.equalsIgnoreCase("summation") || response.equalsIgnoreCase("product")){
            return response;
        }
        else{
            System.out.println("Must choose either summation or product");
            return GetOperation();
        }
    }

    public static String SumOrProductFrom1ToN(int n, String operation){
        int result = 1;
     if(operation.equalsIgnoreCase("summation")){
         result = (n*(n+1))/2;
     }
     else{
         for(int i = 1; i <= n; i++){
          result = i*result;
         }
     }
        String message = String.format("The %s of 1 to %d is %d", operation,  n, result);
        return message;
    }
}
