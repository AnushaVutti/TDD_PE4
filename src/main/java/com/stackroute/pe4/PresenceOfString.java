package com.stackroute.pe4;

public class PresenceOfString {
    public boolean checkPresence(String input) {

        boolean res = input.matches("(.*)Harry(.*)");
        System.out.println(res);
        return res;
    }
}
