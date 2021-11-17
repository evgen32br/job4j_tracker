package ru.job4j.tracker;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "Редактировать заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Редактировать заявку ===");
        int id = input.askInt("Введите идентификатор: ");
        String name = input.askStr("Введите имя: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка изменена успешно.");
        } else {
            System.out.println("Ошибка замены заявки.");
        }
        return true;
    }
}
