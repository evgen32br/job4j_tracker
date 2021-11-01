package ru.job4j.oop;

public class Dentist extends Doctor {
    private String workplace;

    public Dentist(String name, String surname, String education, String birthday,
                   String diagnosis, String workplace) {
        super(name, surname, education, birthday, diagnosis);
        this.workplace = workplace;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void makesTeeth() {
    }
}
