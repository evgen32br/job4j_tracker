package ru.job4j.oop;

public class Doctor extends Profession {
    private String diagnosis;

    public Doctor(String name, String surname, String education, String birthday,
                  String diagnosis) {
        super(name, surname, education, birthday);
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }
}
