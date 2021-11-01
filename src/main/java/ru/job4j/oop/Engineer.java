package ru.job4j.oop;

public class Engineer extends Profession {
    private String specialization;

    public Engineer(String name, String surname, String education,
                    String birthday, String specialization) {
        super(name, surname, education, birthday);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

}
