package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Состояние " + active);
        System.out.println("Идентификатор пользователя " + status);
        System.out.println("Сообщение системы " + message);
    }

    public static void main(String[] args) {
        Error notError = new Error();
        notError.printInfo();
        System.out.println();
        Error error1 = new Error(false, 0, "Доступ запрещен!");
        error1.printInfo();
        System.out.println();
        Error error2 = new Error(true, 2, "Требуется подтверждение учетной записи");
        error2.printInfo();
    }
}
