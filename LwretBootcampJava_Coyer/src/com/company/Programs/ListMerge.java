package com.company.Programs;

public class ListMerge {

    private static int[] a = {1,4,6};
    private static int[] b = {2,3,5};

    public static int[] MergeLists() {
        int[] answer = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length)
        {
            if (a[i] < b[j])
            {
                answer[k] = a[i];
                i++;
            }
            else
            {
                answer[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length)
        {
            answer[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length)
        {
            answer[k] = b[j];
            j++;
            k++;
        }
        return answer;
    }

    public static String PrintList(int[] nums){
        String message = "{";
        for(int i = 0; i < nums.length; i++){
            if(i == nums.length - 1){
                message += String.format("%d}", nums[i]);
            }
            else{
                message += String.format("%d, ", nums[i]);
            }
        }
        return message;
    }

    public static String PrintArrays(){
        String message = "The lists of numbers are: ";
        message += String.format("%s %n", PrintList(a));
        message += String.format("%s", PrintList(b));
        return message;
    }
}
