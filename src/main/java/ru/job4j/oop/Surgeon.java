package ru.job4j.oop;

public class Surgeon extends Doctor {
    private String workplace;

    public Surgeon(String name, String surname, String education,
                   String birthday, String diagnosis, String howItWorks) {
        super(name, surname, education, birthday, diagnosis);
        this.workplace = howItWorks;
    }

    public String getHowItWorks() {
        return workplace;
    }

    public void worksScalpel() {
    }
    }