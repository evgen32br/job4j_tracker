package ru.job4j.poly;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " ездит по рельсам");
    }

    @Override
    public void passengerNumber() {
        int size = 500;
        System.out.println("Средняя вместимость пассажиров " + size);
    }
}
