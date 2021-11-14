package ru.job4j.strategy;

public class Rhombus implements Shape {
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return " / \\" + ln
                + "/   \\" + ln
                + "\\   /" + ln
                + " \\ /" + ln;
    }
}

