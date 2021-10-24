package ru.job4j.oop;

public class Hare {
    public void tryEat(Ball ball) {
        System.out.print("От зайчика ");
        ball.tryRun(false);
    }
}