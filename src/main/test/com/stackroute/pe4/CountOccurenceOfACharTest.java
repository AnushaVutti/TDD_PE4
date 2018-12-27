package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountOccurenceOfACharTest {
    private CountOccurenceOfAChar countOfAChar = new CountOccurenceOfAChar();

    @Test
    public void checkSuccess () {
        String string = "Java is java again java again";
        int count = 10; // Count of char 'a'
        assertEquals(count,countOfAChar.countOccurenceOfAChar(string,'a',0,0));
    }
    @Test
    public void checkFailure () {
        String string = "Java is java again java again";
        int count = 11; // Count of char 'a'
        assertNotSame(count,countOfAChar.countOccurenceOfAChar(string,'a',0,0));
    }
    @Test
    public void checkNotNull () {
        String string = "Java is java again java again";
        int count = 10; // Count of char 'a'
        assertNotNull(countOfAChar.countOccurenceOfAChar(string,'a',0,0));
    }


}