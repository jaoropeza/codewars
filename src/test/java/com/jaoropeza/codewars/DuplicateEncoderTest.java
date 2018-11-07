package com.jaoropeza.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DuplicateEncoderTest {
    @Test
    public void test() {
        assertEquals(")()())()(()()(",
                DuplicateEncoder.encodeArray("Prespecialized"));
        assertEquals("))))())))", DuplicateEncoder.encodeArray("   ()(   "));
    }
}
