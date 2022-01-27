package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void whenByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().
                thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenAscByName() {
        List<Job> jobs = Arrays.asList(
                new Job("One_Task1", 1),
                new Job("Four_Task4", 4),
                new Job("Two_Task2", 2),
                new Job("X_task", 5)
        );
        jobs.sort(new JobAscByName());
        List<Job> expect = Arrays.asList(
                new Job("Four_Task4", 4),
                new Job("One_Task1", 1),
                new Job("Two_Task2", 2),
                new Job("X_task", 5)
        );
        assertThat(jobs, is(expect));
    }

    @Test
    public void whenDescByName() {
        List<Job> jobs = Arrays.asList(
                new Job("One_Task1", 1),
                new Job("Four_Task4", 4),
                new Job("Two_Task2", 2),
                new Job("X_task", 5)
        );
        jobs.sort(new JobDescByName());
        List<Job> expect = Arrays.asList(
                new Job("X_task", 5),
                new Job("Two_Task2", 2),
                new Job("One_Task1", 1),
                new Job("Four_Task4", 4)
        );
        assertThat(jobs, is(expect));
    }

    @Test
    public void whenDescByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("One_Task1", 1),
                new Job("Four_Task4", 4),
                new Job("Two_Task2", 2),
                new Job("X_task", 5)
        );
        jobs.sort(new JobDescByPriority());
        List<Job> expect = Arrays.asList(
                new Job("X_task", 5),
                new Job("Four_Task4", 4),
                new Job("Two_Task2", 2),
                new Job("One_Task1", 1)
        );
        assertThat(jobs, is(expect));
    }

    @Test
    public void whenAscByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("One_Task1", 1),
                new Job("Four_Task4", 4),
                new Job("Two_Task2", 2),
                new Job("X_task", 5)
        );
        jobs.sort(new JobAscByPriority());
        List<Job> expect = Arrays.asList(
                new Job("One_Task1", 1),
                new Job("Two_Task2", 2),
                new Job("Four_Task4", 4),
                new Job("X_task", 5)
        );
        assertThat(jobs, is(expect));
    }

    @Test
    public void whenAscByNameAndPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("One_Task1", 1),
                new Job("Four_Task4", 4),
                new Job("Two_Task2", 2),
                new Job("X_task", 5)
        );
        jobs.sort(new JobAscByName().
                thenComparing(new JobAscByPriority()));
        List<Job> expect = Arrays.asList(
                new Job("Four_Task4", 4),
                new Job("One_Task1", 1),
                new Job("Two_Task2", 2),
                new Job("X_task", 5)
        );
        assertThat(jobs, is(expect));
    }

    @Test
    public void whenDescByNameLnAndAscByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("One_Task1", 1),
                new Job("Four_Task4", 4),
                new Job("Two_Task2", 2),
                new Job("X_task", 5)
        );
        jobs.sort(new JobDescByNameLn().
                thenComparing(new JobAscByPriority()));
        List<Job> expect = Arrays.asList(
                new Job("Four_Task4", 4),
                new Job("One_Task1", 1),
                new Job("Two_Task2", 2),
                new Job("X_task", 5)
        );
        assertThat(jobs, is(expect));
    }

    @Test
    public void whenDescByNameLnAndDescByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("One_Task1", 1),
                new Job("Four_Task4", 4),
                new Job("Two_Task2", 2),
                new Job("X_task", 5)
        );
        jobs.sort(new JobDescByNameLn().
                thenComparing(new JobDescByPriority()));
        List<Job> expect = Arrays.asList(
                new Job("Four_Task4", 4),
                new Job("Two_Task2", 2),
                new Job("One_Task1", 1),
                new Job("X_task", 5)
        );
        assertThat(jobs, is(expect));
    }
}