package com.jaoropeza.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiddleTest {
    @Test
    public void evenTests() {
        assertEquals("es", Middle.getMiddle("test"));
        assertEquals("dd", Middle.getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", Middle.getMiddle("testing"));
        assertEquals("A", Middle.getMiddle("A"));
    }
}
