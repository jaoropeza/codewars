package com.jaoropeza.codewars;

public class DigPow {

    public static long digPow7(int n, int p) {
        String num = String.valueOf(n);
        String[] numA = num.split("");
        long sum = 0;
        for (int i = 0; i < numA.length; i++) {
            sum = sum + (long) Math.pow(Long.parseLong(numA[i]), p + i);
        }
        return sum % n == 0 ? sum / n : -1;
    }

    public static long digPow(int n, int p) {
        String number = String.valueOf(n);
        final int[] cont = {p};

        long sum = number
            .chars()
            .mapToObj(Character::getNumericValue)
            .mapToLong(digit -> (long) Math.pow(digit, cont[0]++))
            .sum();

        return sum % n == 0 ? sum / n : -1;
    }

}

