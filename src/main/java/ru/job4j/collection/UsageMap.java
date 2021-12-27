package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        map.put("4ibo@mail.ru", "Evgenii");
        map.put("vasy@mail.ru", "Vasy Pypcin");
        map.put("ivanivan@mail.ru", "Ivan Ivanov");
        String rsl = map.get("4ibo@mail.ru");
        System.out.println(rsl);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String val = entry.getValue();
            System.out.println(key + " = " + val);
        }
    }
}
