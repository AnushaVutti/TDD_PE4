package com.stackroute.pe4;

public class CountOccurenceOfAChar {

    public int countCharOccurence (String input, char ch, int index, int count) {


        if (index < input.length()) {
            if (ch == input.charAt(index)) {
                count++;
            }
            index++;
            count = countCharOccurence(input, ch, index, count);
        }
        return count;

    }

}
