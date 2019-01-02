package com.stackroute.pe4;

public class ReplaceChar {
    public String replaceCharacter(String input, char[] ch) {
        String intermediate;
        String result;
        intermediate = input.replace(ch[0],ch[1]);
        result = intermediate.replace(ch[2], ch[3]);
        return result;
    }

}
