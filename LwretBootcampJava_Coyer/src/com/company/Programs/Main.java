package com.company.Programs;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String[] programs = {"Hello World","Hello User","Summation", "Sum or Product"};
    public static void main(String[] args) {
        while(true){
            int programIndex = GetProgram();
            if(programIndex < 0){
                break;
            }
            String programName = programs[programIndex].toUpperCase();
            switch(programName){
                case "HELLO WORLD":
                    HandleHelloWorld();
                    break;
                case "HELLO USER":
                    HandleHelloUser();
                    break;
                case "SUMMATION":
                    HandleSummation();
                    break;
                case "SUM OR PRODUCT":
                    HandleSumOrProduct();
                default:
                    break;
            }
        }
    }

    private static int GetProgram(){
        System.out.println("Welcome, please select a program to run:");
        String message = "";
        for(int i = 0; i < programs.length; i++){
            message += String.format("%d - %s%n", i + 1, programs[i]);
        }
        System.out.print(message);
        String response = scanner.nextLine();
        boolean validInput = TryParseInt(response);
        if(validInput){
            int programIndex = Integer.parseInt(response);
            if(programIndex <= programs.length && programIndex > 0){
                return programIndex - 1;
            }
            else {
                System.out.println("Value must match one of the program indexes");
                return GetProgram();
            }

        }
        else{
            System.out.println("Please enter a valid number");
            GetProgram();
        }
        return 0;
    }

    private static boolean TryParseInt(String value){
        try {
            Integer.parseInt(value);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    private static void HandleHelloWorld() {
        System.out.println(HelloWorld.GetMessage());
    }

    private static void HandleHelloUser(){
        String name = HelloUser.GetUserName();
        System.out.println(HelloUser.GetMessage(name));
    }

    private static int GetNumber(String operation){
        System.out.printf("What number would you like to see the %s for?", operation);
        String response = scanner.nextLine();
        if(TryParseInt(response)) {
            int n = Integer.parseInt(response);
            return n;
        }
        else{
            System.out.println("Must enter a valid number");
            return GetNumber(operation);
        }
    }

    private static void HandleSummation() {
        int n = GetNumber("summation");
        String message = Summation.SumFrom1ToN(n);
        System.out.println(message);
    }

    private static void HandleSumOrProduct() {
        String operation = SummationOrProduct.GetOperation();
        int n = GetNumber(operation);
            String result = SummationOrProduct.SumOrProductFrom1ToN(n, operation);
            System.out.println(result);
        }
}
