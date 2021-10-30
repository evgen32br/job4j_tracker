package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void distanceOne() {
        Point x = new Point(0, 3);
        Point y = new Point(1, 4);
        double rsl = x.distance(y);
        assertThat(rsl, closeTo(1.41, 0.01));
    }

    @Test
    public void distanceTwo() {
        Point x = new Point(2, 2);
        Point y = new Point(0, 0);
        double rsl = x.distance(y);
        assertThat(rsl, closeTo(2.82, 0.01));
    }
}