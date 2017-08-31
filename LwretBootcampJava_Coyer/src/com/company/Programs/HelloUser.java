package com.company.Programs;

import java.util.Scanner;

public class HelloUser {

    public static String GetUserName(){
        System.out.println("Please enter your name:");
        String name = new Scanner(System.in).nextLine();
        if(name.length() > 0){
            return name;
        }
        else {
            return GetUserName();
        }
    }

    public static String GetMessage(String name){
            String message = String.format("Hi, %s. How are you?", name);
            return message;
    }
}
