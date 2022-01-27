package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("One_Task1", 1),
                new Job("Four_Task4", 4),
                new Job("Two_Task2", 2),
                new Job("X_task", 5)
        );
        System.out.println("Сортировка по возрастанию приоритета");
        jobs.sort(new JobAscByPriority());
        System.out.println(jobs);
        System.out.println();

        System.out.println("Сортировка по убыванию приоритета");
        jobs.sort(new JobDescByPriority());
        System.out.println(jobs);
        System.out.println();

        System.out.println("Сортировка по возрастанию имени");
        jobs.sort(new JobDescByName().reversed());
        System.out.println(jobs);
        System.out.println();

        System.out.println("Сортировка по убыванию имени");
        jobs.sort(new JobDescByName());
        System.out.println(jobs);
        System.out.println();

        System.out.println("Сортировка по возрастанию кол-ва символов");
        jobs.sort(new JobAscByNameLn());
        System.out.println(jobs);
        System.out.println();

        System.out.println("Сортировка по убыванию кол-ва символов");
        jobs.sort(new JobDescByNameLn());
        System.out.println(jobs);
        System.out.println();

        System.out.println("Сортировка по убыванию кол-ва символов и возрастанию приоритета");
        jobs.sort(new JobDescByNameLn().
                thenComparing(new JobAscByPriority()));
        System.out.println(jobs);
        System.out.println();

        System.out.println("Сортировка по убыванию кол-ва символов, убыванию имени,"
                + "убыванию приоритета");
        Comparator<Job> comb = new JobDescByNameLn()
                .thenComparing(new JobDescByName())
                .thenComparing(new JobDescByPriority());
        jobs.sort(comb);
        System.out.println(jobs);
    }
}
