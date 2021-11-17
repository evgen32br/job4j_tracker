package ru.job4j.tracker;

public class SearchIdAction implements UserAction {
    @Override
    public String name() {
        return "Поиск заявку по идентификатору";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Поиск заявки по идентификатору ===");
        int id = input.askInt("Введите идентификатор: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявка с введенным идентификатором : " + id
                    + " не найдена.");
        }
        return true;
    }
}
