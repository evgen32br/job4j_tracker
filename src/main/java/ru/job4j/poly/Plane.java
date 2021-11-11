package ru.job4j.poly;

public class Plane implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летает по воздуху");
    }

    @Override
    public void passengerNumber() {
        int size = 150;
        System.out.println("Средняя вместимость пассажиров " + size);
    }
}
