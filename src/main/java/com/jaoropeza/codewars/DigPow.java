package com.jaoropeza.codewars;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class DigPow {

    public static long digPow7(int n, int p) {
        String num = String.valueOf(n);
        String[] numA = num.split("");
        long result = -1;
        long sumPowers = 0;
        for (int i = 0; i < numA.length; i++) {
            sumPowers = sumPowers + (long) Math.pow(Long.parseLong(numA[i]), p + i);
        }
        for (int i = 1; i < Math.floor(Math.sqrt(sumPowers)); i++) {
            if (n * i == sumPowers) {
                return i;
            }
        }
        return result;
    }

    public static long digPow(int n, int p) {
        String number = String.valueOf(n);
        final int[] cont = {p};

        long sum = number
            .chars()
            .mapToObj(Character::getNumericValue)
            .mapToLong(digit -> (long) Math.pow(digit, cont[0]++))
            .sum();

        OptionalInt first = IntStream.range(1, (int) Math.floor(Math.sqrt(sum))).filter(i -> i * n == sum).findFirst();
        return first.isPresent() ? first.getAsInt() : -1;
    }

}

