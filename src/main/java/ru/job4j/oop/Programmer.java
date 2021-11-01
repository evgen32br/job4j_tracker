package ru.job4j.oop;

public class Programmer extends Engineer {
    private String project;

    public Programmer(String name, String surname, String education, String birthday,
                      String specialization, String project) {
        super(name, surname, education, birthday, specialization);
        this.project = project;
    }

    public String getProject() {
        return project;
    }

    public void program() {
    }
}
