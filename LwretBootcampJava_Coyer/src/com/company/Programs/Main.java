package com.company.Programs;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String[] programs = {"Hello World","Hello User","Summation"};
    public static void main(String[] args) {
        while(true){
            int programIndex = GetProgram();
            if(programIndex < 0){
                break;
            }
            String programName = programs[programIndex].toUpperCase();
            switch(programName){
                case "HELLO WORLD":
                    System.out.println(HelloWorld.GetMessage());
                    break;
                case "HELLO USER":
                    String name = HelloUser.GetUserName();
                    System.out.println(HelloUser.GetMessage(name));
                    break;
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
        String response = scanner.next();
        System.out.println(response);
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
}
