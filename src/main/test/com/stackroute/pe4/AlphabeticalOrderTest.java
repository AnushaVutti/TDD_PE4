package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlphabeticalOrderTest {
    private AlphabeticalOrder alphabeticalSort = new AlphabeticalOrder();
    @Test
    public void checkSuccess () {
        String input = "String is a sequence of characters.In java, objects of String are immutable which means a constant and cannot be changed once created.";
        String sortedString = " a a and are be cannot changed characters constant created immutable in is java means objects of of once sequence string string which ";
        assertEquals(sortedString,alphabeticalSort.alphabeticalOrderSort(input));
    }
    @Test
    public void checkFailure () {
        String input = "String is a sequence of characters. In java, objects of String are immutable which means a constant and cannot be changed once created.";
        String sortedString = " a a and are be cannot changed characters constant created immutable in is java means objects of of once sequence string string which ";
        assertNotSame(sortedString,alphabeticalSort.alphabeticalOrderSort(input));
    }
    @Test
    public void checkNotNull () {
        String input = "String is a sequence of characters. In java, objects of String are immutable which means a constant and cannot be changed once created.";
        //String sortedString = "a characters is of sequence string ";
        assertNotNull(alphabeticalSort.alphabeticalOrderSort(input));
    }


}