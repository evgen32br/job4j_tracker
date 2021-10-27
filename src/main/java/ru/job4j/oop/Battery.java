package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int val) {
        this.load = val;
    }

    public void exchange(Battery another) {
        this.load -= another.load;
        another.load += another.load;
    }

    public static void main(String[] args) {
        Battery battery1 = new Battery(100);
        Battery battery2 = new Battery(15);
        System.out.println("1 батарейка " + battery1.load + " 2 батарейка " + battery2.load);
        battery1.exchange(battery2);
        System.out.println("1 батарейка " + battery1.load + " 2 батарейка " + battery2.load);
    }
}
