package com.jaoropeza.codewars;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;

public class UtilLocalDate {
    public static LocalDate stringToLocalDate(String date) {
        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate localDate;
        try {
            localDate = LocalDate.parse(date, dateTimeFormatter);
        } catch (DateTimeParseException e) {
            return null;
        }
        return localDate;
    }

    public static void main(String[] args) {
        String numero = "123456789";
        final String[] number = numero.split("");
        final Optional<Integer> reduce = Arrays.stream(number)
            .map(Integer::parseInt)
            .reduce((a, b) -> a * b);
        reduce.ifPresent(System.out::println);
//        menu();
    }

    public static void menu() {
        Scanner in = new Scanner(System.in);
        String dateRequest = in.next();
        while (stringToLocalDate(dateRequest) == null) {
            dateRequest = in.next();
        }
        LocalDate date = stringToLocalDate(dateRequest);
    }
}
