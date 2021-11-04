package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book fantasy = new Book("Фантези", 250);
        Book drama = new Book("Драма", 300);
        Book detective = new Book("Детектив", 500);
        Book textbook = new Book("Чистый код", 2000);
        Book[] book = new Book[4];
        book[0] = fantasy;
        book[1] = drama;
        book[2] = detective;
        book[3] = textbook;
        for (Book title : book) {
            System.out.println(title.getName() + "  " + title.getPages());
        }
        book[0] = textbook;
        book[3] = fantasy;
        System.out.println();
        for (Book title : book) {
            System.out.println(title.getName() + "  " + title.getPages());
        }
        for (Book title : book) {
            if ("Чистый код".equals(title.getName())) {
                System.out.println(System.lineSeparator() + "Книга которую мы искали");
                System.out.println(title.getName() + " - " + title.getPages());
                break;
            }
        }
    }
}
