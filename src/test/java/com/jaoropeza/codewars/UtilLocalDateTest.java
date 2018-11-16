package com.jaoropeza.codewars;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class UtilLocalDateTest {

    @Test
    public void testLocalDate() {
        assertEquals(LocalDate.parse("2005-09-15"), UtilLocalDate.stringToLocalDate("15/9/2005"));
        assertEquals(LocalDate.parse("1990-10-12"), UtilLocalDate.stringToLocalDate("12/10/1990"));
        assertEquals(LocalDate.parse("1990-01-01"), UtilLocalDate.stringToLocalDate("1/1/1990"));
        assertEquals(LocalDate.parse("1990-01-09"), UtilLocalDate.stringToLocalDate("9/1/1990"));
        assertEquals(LocalDate.parse("1990-01-10"), UtilLocalDate.stringToLocalDate("10/1/1990"));
        assertEquals(LocalDate.parse("1990-02-28"), UtilLocalDate.stringToLocalDate("31/2/1990"));
        assertNull(UtilLocalDate.stringToLocalDate("99/99/9999"));
        assertNull(UtilLocalDate.stringToLocalDate("/2/1991"));
    }
}
