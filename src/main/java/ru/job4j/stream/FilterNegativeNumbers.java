package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNegativeNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.
                asList(1, -3, 3, 5, -4, 2, 0, -2, 4, -4, -5, 6);
        List<Integer> positive = numbers.stream().filter(o -> o > 0).
                sorted().collect(Collectors.toList());
        positive.forEach(System.out::println);
    }
}
