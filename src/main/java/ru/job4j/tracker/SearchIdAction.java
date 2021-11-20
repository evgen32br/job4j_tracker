package ru.job4j.tracker;

public class SearchIdAction implements UserAction {
    private final Output out;

    public SearchIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Поиск заявку по идентификатору";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Поиск заявки по идентификатору ===");
        int id = input.askInt("Введите идентификатор: ");
        Item item = tracker.findById(id);
        if (item != null) {
            out.println(item);
        } else {
            out.println("Заявка с введенным идентификатором : " + id
                    + " не найдена.");
        }
        return true;
    }
}
