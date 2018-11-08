package com.jaoropeza.codewars;

public class Middle {
    public static String getMiddle(String word) {
        final int length = word.length();
        final int middle = length / 2;
        final int floor = (int) Math.floor(middle);
        return length % 2 == 0 ? word.substring(middle - 1, middle + 1) : word.substring(floor, floor + 1);
    }
}
