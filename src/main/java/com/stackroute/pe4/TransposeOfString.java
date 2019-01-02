package com.stackroute.pe4;

public class TransposeOfString {
    public String transposeAString(String input) {
        String revers="";
        String output="";
        StringBuffer sbf = new StringBuffer(input);
        sbf = sbf.reverse();
        revers = sbf.toString(); //To convert string buffer back to string
       // System.out.println(res);
        String[] arr = revers.split(" ");
        String[] reverseArr = new String[arr.length];
        // To obtain the transpose
        int j=0;
        for (int i=arr.length-1; i>=0; i--){
          reverseArr[j] = arr[i];
          output = output + reverseArr[j] + " ";
          j++;
        }
        System.out.println(output);
        return output;

    }

}
