package com.stackroute.pe4;

import java.util.Arrays;

public class AlphabeticalOrder {
    public  String alphabeticalOrder(String input) {

        String temp;
        String result;
        String str = "";
        String[] arr = input.split("[,. ]");

        // To sort the string array in alphabetical order
        Arrays.sort(arr);
        for ( int i=0; i<arr.length; i++) {
            str = str+arr[i]+" ";

        }
        System.out.println(str);
        return str;
    }
}
