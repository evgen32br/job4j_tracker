package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item dayTime = new Item();
        Item entity = new Item(22, "Захар");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String outDayAndTime = dayTime.getCreated().format(formatter);
        System.out.println(outDayAndTime);
        System.out.println(entity);
    }
}
