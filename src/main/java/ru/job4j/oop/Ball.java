package ru.job4j.oop;

public class Ball {
    public void tryRun(boolean condition) {
        if (condition) {
            System.out.println("сбежать не смог");
            System.out.println("Съели колобка :-(");
        } else {
            System.out.println("Колобок сбежал");
        }
    }
}
