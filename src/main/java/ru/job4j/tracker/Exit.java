package ru.job4j.tracker;

public class Exit implements UserAction {
    @Override
    public String name() {
        return "Выход";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Вы вышли из системы");
        return false;
    }
}
