package ru.job4j.tracker;

public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            int select = input.askInt("Выберите пункт: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showAllItem(tracker);
            } else if (select == 2) {
                StartUI.editItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.searchIdItem(input, tracker);
            } else if (select == 5) {
                StartUI.searchNameItem(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Создать новую заявку ===");
        String name = input.askStr("Введите имя: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Добавленная заявка: " + item);
    }

    public static void showAllItem(Tracker tracker) {
        System.out.println("=== Показать все заявки ===");
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Хранилище еще не содержит заявок");
        }
    }

    public static void editItem(Input input, Tracker tracker) {
        System.out.println("=== Редактировать заявку ===");
        int id = input.askInt("Введите идентификатор: ");
        String name = input.askStr("Введите имя: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка изменена успешно.");
        } else {
            System.out.println("Ошибка замены заявки.");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Удалить заявку ===");
        int id = input.askInt("Введите идентификатор: ");
        if (tracker.delete(id)) {
            System.out.println("Заявка удалена успешно.");
        } else {
            System.out.println("Ошибка удаления заявки.");
        }
    }

    public static void searchIdItem(Input input, Tracker tracker) {
        System.out.println("=== Поиск заявку по идентификатору ===");
        int id = input.askInt("Введите идентификатор: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявка с введенным идентификатором : " + id
                    + " не найдена.");
        }
    }

    public static void searchNameItem(Input input, Tracker tracker) {
        System.out.println("=== Поиск заявки по имени ===");
        String name = input.askStr("Введите имя: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Заявки с именем: " + name + " не найдены.");
        }
    }

    private void showMenu() {
        String[] menu = {
                "Создать новый элемент", "Показать все заявки", "Редактировать заявку",
                "Удалить заявку", "Найти заявку по идентификатору", "Найти заявки по имени",
                "Выход из программы"
        };
        System.out.println("Меню:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}