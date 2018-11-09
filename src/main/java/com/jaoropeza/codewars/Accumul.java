package com.jaoropeza.codewars;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Accumul {

    public static String accum(String s) {
        AtomicInteger contador = new AtomicInteger(1);
        return s
            .chars()
            .mapToObj(i -> (char) i)
            .map(character -> {
                StringBuilder result = new StringBuilder();
                for (int i = 1; i <= contador.get(); i++) {
                    if (i == 1) {
                        result.append(character.toString().toUpperCase());
                    } else {
                        result.append(character.toString().toLowerCase());
                    }
                }
                if (contador.get() != s.length()) {
                    result.append("-");
                }
                contador.getAndIncrement();
                return result;
            })
            .collect(Collectors.joining());
    }
}
