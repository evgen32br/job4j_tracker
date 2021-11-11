package ru.job4j.poly;

public class Autobus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " ездит по трассе");
    }

    @Override
    public void passengerNumber() {
        int size = 50;
        System.out.println("Средняя вместимость пассажиров " + size);
    }
}
