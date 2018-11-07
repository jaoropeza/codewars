package com.jaoropeza.codewars;

import java.util.stream.Collectors;

public class DuplicateEncoder {
    static String encode(String word) {
        StringBuilder result = new StringBuilder();
        word = word.toLowerCase();
        if (word.isEmpty()) {
            result.append("(");
            return result.toString();
        }

        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    ++count;
                }
            }
            if (count == 1) {
                result.append("(");
            } else {
                result.append(")");
            }
        }
        return result.toString();
    }

    static String encodeArray(String word) {
        return word.toLowerCase()
            .chars()
            .mapToObj(i -> word.toLowerCase().indexOf(i) != word.toLowerCase().lastIndexOf(i) ? ")" : "(")
            .collect(Collectors.joining());
    }
}
