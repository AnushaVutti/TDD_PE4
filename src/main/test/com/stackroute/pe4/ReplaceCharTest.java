package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharTest {
    private ReplaceChar replace = new ReplaceChar();
    @Test
    public void checkSuccess () {
        String original = "daily dry";
        char[] ch = {'d', 'f' ,'l', 't'};
        assertEquals("faity fry",replace.replaceChar(original,ch));
    }
    @Test
    public void checkFailure () {
        String original = "daily dry";
        char[] ch = {'d', 'f' ,'l', 't'};
        assertNotSame("faify fry",replace.replaceChar(original,ch));
    }
    @Test
    public void checkNotNull () {
        String original = "daily dry";
        char[] ch = {'d', 'f' ,'l', 't'};
        assertNotNull(replace.replaceChar(original,ch));
    }

}