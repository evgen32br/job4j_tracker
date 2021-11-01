package ru.job4j.oop;

public class Diagnosis {

    public void heal() {
        Doctor doctor = new Doctor(" ", "", "", "", "");
        System.out.println(doctor.getDiagnosis());
    }
}
