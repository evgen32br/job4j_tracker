package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ItemSortTest {
    @Test
    public void whenItemAscByName() {
        List<Item> items = Arrays.asList(
                new Item("Petr"),
                new Item("Ivan"),
                new Item("Alex"),
                new Item("Evgen")
        );
        items.sort(new ItemAscByName());
        List<Item> expect = Arrays.asList(
                new Item("Alex"),
                new Item("Evgen"),
                new Item("Ivan"),
                new Item("Petr")
        );
        assertThat(items, is(expect));
    }

    @Test
    public void whenItemDescByName() {
        List<Item> items = Arrays.asList(
                new Item("Ivan"),
                new Item("Petr"),
                new Item("Alex"),
                new Item("Evgen")
        );
        items.sort(new ItemDescByName());
        List<Item> expect = Arrays.asList(
                new Item("Petr"),
                new Item("Ivan"),
                new Item("Evgen"),
                new Item("Alex")
        );
        assertThat(items, is(expect));
    }

    @Test
    public void whenItemAscById() {
        List<Item> items = Arrays.asList(
                new Item(1, "Petr"),
                new Item(3, "Ivan"),
                new Item(6, "Alex"),
                new Item(4, "Evgen")
        );
        Collections.sort(items);
        List<Item> expect = Arrays.asList(
                new Item(1, "Petr"),
                new Item(3, "Ivan"),
                new Item(4, "Evgen"),
                new Item(6, "Alex")
        );
        assertThat(items, is(expect));
    }
}