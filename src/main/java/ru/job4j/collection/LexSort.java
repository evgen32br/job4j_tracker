package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] strLeft = left.split("\\.");
        String[] strRight = right.split("\\.");
        int valLeft = Integer.parseInt(strLeft[0]);
        int valRight = Integer.parseInt(strRight[0]);
        return Integer.compare(valLeft, valRight);
    }
}
