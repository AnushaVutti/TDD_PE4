package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class PresenceOfStringTest {
    private PresenceOfString presence = new PresenceOfString();
    @Test
    public void checkSuccess() {
        String input = "This is Harry";
        assertEquals(true,presence.presenceOfString(input));
    }
    @Test
    public void checkFailure() {
        String input = "This is Henry";
        assertEquals(false,presence.presenceOfString(input));
    }
    @Test
    public void checkNotNull() {
        String input = "This is Henry";
        assertNotNull(presence.presenceOfString(input));
    }

}