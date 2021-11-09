package ru.job4j.oop;

public class College  {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student student = freshman;
        Object obj = freshman;
        Student student1 = new Student();
        System.out.println(freshman.hashCode());
        System.out.println(student.hashCode());
        System.out.println(obj.hashCode());
        System.out.println(student1.hashCode());
    }
}
