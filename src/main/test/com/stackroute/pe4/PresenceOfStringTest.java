package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class PresenceOfStringTest {
    private PresenceOfString presence = new PresenceOfString();
    @Test
    public void checkSuccess() {
        String input = "This is Harry";
        assertEquals(true,presence.checkPresence(input));
    }
    @Test
    public void checkFailure() {
        String input = "This is Henry";
        assertEquals(false,presence.checkPresence(input));
    }
    @Test
    public void checkNotNull() {
        String input = "This is Henry";
        assertNotNull(presence.checkPresence(input));
    }

}