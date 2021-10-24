package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.print(this.name);
        System.out.print(this.food);
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meal) {
        this.food = meal;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("Гав ");
        gav.eat("Котлета");
        gav.show();
        System.out.println();
        Cat black = new Cat();
        black.giveNick("Черный кот ");
        black.eat("Рыба");
        black.show();
    }
}
