package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Иван Иванов Иванович ");
        student.setGroup(" Группа №1 ");
        student.setEntrance(new Date());
        System.out.println(student.getFullName() + student.getGroup() + student.getEntrance());
    }
}
