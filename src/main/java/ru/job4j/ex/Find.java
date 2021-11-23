package ru.job4j.ex;

public class Find {
    public static String get(String[] data, int index) {
        if (index < 0 || index >= data.length - 1) {
            throw new ArrayIndexOutOfBoundsException("Не верный индекс массива");
        }
        return data[index];
    }

    public static void main(String[] args) {
        String[] data = {"one", "two", "three"};
        String rsl = Find.get(data, 1);
        System.out.println(rsl);
    }
}
