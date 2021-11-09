package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {

    }

    @Override
    public void passengers(int count) {

    }

    @Override
    public double refuel(int fuel) {
        return 48.50 * fuel;
    }
}
