package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
public class ProfilesTest {

    @Test
    public void whenTestMethodCollect() {
        Address first = new Address("City1", "Street1", 1, 1);
        Address second = new Address("City2", "Street2", 2, 2);
        Address third = new Address("City3", "Street3", 3, 3);
        List<Profile> profiles = Arrays.asList(
                new Profile(first),
                new Profile(second),
                new Profile(third)
        );
        List<Address> result = Profiles.collect(profiles);
        List<Address> expected = Arrays.asList(first, second, third);
        assertEquals(expected, result);
    }

    @Test
    public void whenTestCollect() {
        Address orel = new Address("Орел", "Орловская", 56, 38);
        Address bryansk = new Address("Брянск", "Авиационная", 20, 2);
        Address tula = new Address("Тула", "Центральная", 10, 18);
        List<Profile> profiles = Arrays.asList(
                new Profile(orel),
                new Profile(bryansk),
                new Profile(tula)
        );
        List<Address> result = Profiles.collectSortWithoutDuplicate(profiles);
        List<Address> expected = Arrays.asList(bryansk, orel, tula);
        assertEquals(expected, result);
    }

    @Test
    public void whenTestMethodCollectSortWithoutDuplicate() {
        Address first = new Address("City1", "Street1", 1, 1);
        Address second = new Address("City2", "Street2", 2, 2);
        Address third = new Address("City3", "Street3", 3, 3);
        Address fourth = new Address("City1", "Street1", 1, 1);
        Address fifth = new Address("City2", "Street2", 2, 2);
        Address seventh = new Address("City3", "Street3", 3, 3);
        List<Profile> profiles = Arrays.asList(
                new Profile(second),
                new Profile(fourth),
                new Profile(fifth),
                new Profile(first),
                new Profile(seventh),
                new Profile(third)
        );
        List<Address> result = Profiles.collectSortWithoutDuplicate(profiles);
        List<Address> expected = Arrays.asList(first, second, third);
        assertEquals(expected, result);
    }
}
