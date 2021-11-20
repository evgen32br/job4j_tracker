package ru.job4j.ex;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void calc() {
        new Fact().calc(-1);
    }

    @Test
    public void when5then3() {
        int rsl = new  Fact().calc(5);
        assertThat(rsl, is(120));
    }
}