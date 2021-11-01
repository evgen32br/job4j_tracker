package ru.job4j.oop;

public class Builder extends Engineer {
    private String object;

    public Builder(String name, String surname, String education,
                   String birthday, String specialization, String object) {
        super(name, surname, education, birthday, specialization);
        this.object = object;
    }

    public String getObject() {
        return object;
    }

    public void construction() {

    }
}
