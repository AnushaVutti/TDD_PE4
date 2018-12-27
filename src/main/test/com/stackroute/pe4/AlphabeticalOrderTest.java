package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlphabeticalOrderTest {
    private AlphabeticalOrder alphabeticalSort = new AlphabeticalOrder();
    @Test
    public void checkSuccess () {
        String input = "string is a sequence of characters.";
        String sortedString = "a characters is of sequence string ";
        assertEquals(sortedString,alphabeticalSort.alphabeticalOrder(input));
    }
    @Test
    public void checkFailure () {
        String input = "string is a sequence of characters.";
        String sortedString = "a characters is of sequence string.";
        assertNotSame(sortedString,alphabeticalSort.alphabeticalOrder(input));
    }
    @Test
    public void checkNotNull () {
        String input = "string is a sequence of characters.";
        String sortedString = "a characters is of sequence string ";
        assertNotNull(sortedString,alphabeticalSort.alphabeticalOrder(input));
    }


}