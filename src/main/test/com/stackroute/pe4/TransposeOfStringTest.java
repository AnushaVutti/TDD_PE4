package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeOfStringTest {
    private TransposeOfString transpose= new TransposeOfString();
    @Test
    public void checkSuccess() {
        String input ="a quick brown fox jumps over the lazy dog";
        String result = "a kciuq nworb xof spmuj revo eht yzal god ";
        assertEquals(result,transpose.transposeAString(input));
    }
    @Test
    public void checkFailure() {
        String input ="a quick brown fox jumps over the lazy dog";
        String result = "a kciuq nworb xof spmuj revo eht yzal good ";
        assertNotSame(result,transpose.transposeAString(input));
    }
    @Test

    public void checkNotNull() {
        String input ="a quick brown fox jumps over the lazy dog";

        assertNotNull(transpose.transposeAString(input));
    }
}