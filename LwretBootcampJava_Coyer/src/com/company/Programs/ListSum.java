package com.company.Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListSum {

    public static List<Integer> GetList(){
        System.out.println("Please enter a comma delineated list of numbers to sum");
        String input = new Scanner(System.in).nextLine();
        String[] sections = input.split(",");
        List<Integer> numbers = new ArrayList<Integer>();
        for(String section: sections){
            try{
                int number = Integer.parseInt(section);
                numbers.add(number);
            }catch(Exception e){
                throw(e);
            }
        }
        return numbers;
    }

    public static String GetOperation(){
        System.out.println("Would you like to use for, while or recursion?");
        String response = new Scanner(System.in).nextLine();
        if(response.equalsIgnoreCase("for") || response.equalsIgnoreCase("while") ||
                response.equalsIgnoreCase("recursion")){
            return response;
        }
        else{
            System.out.println("Please choose either for, while or recursion");
            return GetOperation();
        }
    }

    public static String SumList(List<Integer> numbers, String operation){
        if(operation.equalsIgnoreCase("for")){
            return SumListWithFor(numbers);
        }
        else if(operation.equalsIgnoreCase("while")){
            return SumListWithWhile(numbers);
        }
        else{
            return SumListWithRecursion(numbers, 0,0);
        }
    }

    public static String SumListWithFor(List<Integer> numbers){
        int result = 0;
        for(int number: numbers){
            result += number;
        }
        String message = String.format("The result from calculating the list of numbers is %d", result);
        return message;
    }

    public static String SumListWithWhile(List<Integer> numbers){
        int result = 0;
        int i = 0;
        while(i < numbers.size()){
            result += numbers.get(i);
            i++;
        }
        String message = String.format("The result from calculating the list of numbers is %d", result);
        return message;
    }

    public static String SumListWithRecursion(List<Integer> numbers, int i, int result) {
        if (i < numbers.size()) {
            result += numbers.get(i);
            return SumListWithRecursion(numbers, i + 1, result);
        } else {
            String message = String.format("The result from calculating the list of numbers is %d", result);
            return message;
        }
    }
}
