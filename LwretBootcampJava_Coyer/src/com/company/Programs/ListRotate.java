package com.company.Programs;

import java.util.*;

public class ListRotate {


    public static List<Integer> GetList(){
        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
        return numbers;
    }


    public static String PrintList(List<Integer> numbers){
        String message = "The list of numbers is: {";
        for(int number: numbers){
            if(numbers.indexOf(number) == (numbers.size() -1)){
                message += String.format("%d", number);
            }
            else{
                message += String.format("%d, ", number);
            }

        }
        message += "}";
        return message;
    }

    public static int GetRotateNum(){
        List<Integer> numbers = GetList();
        System.out.println(PrintList(numbers));
        System.out.println("In order to rotate the list, please select an integer number of spaces to rotate it. (i.e. 2)");
        String response = new Scanner(System.in).nextLine();
        if(TryParseInt(response)){
            int rotateNum = Integer.parseInt(response);
            return rotateNum;
        }
        else{
            System.out.println("Must enter a valid integer");
            return GetRotateNum();
        }
    }

    public static String RotateList(int rotateNum){
        List<Integer> _nums = GetList();
        int size = _nums.size();
        Collections.rotate(_nums, -rotateNum);
        return PrintList(_nums);
    }

    public static boolean TryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
