package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Меню:" + System.lineSeparator()
                        + "0. Выход" + System.lineSeparator()
                        + "Вы вышли из системы" + System.lineSeparator()
        ));
    }

    @Test
    public void whenEdit() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        String replaceName = "New Test Name";
        Input in = new StubInput(
                new String[]{"0", String.valueOf(one.getId()), replaceName, "1"}
        );
        UserAction[] actions = new UserAction[]{
                new EditAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Меню:" + ln
                        + "0. Редактировать заявку" + ln
                        + "1. Выход" + ln
                        + "=== Редактировать заявку ===" + ln
                        + "Заявка изменена успешно." + ln
                        + "Меню:" + ln
                        + "0. Редактировать заявку" + ln
                        + "1. Выход" + ln
                        + "Вы вышли из системы" + ln
        ));
    }

    @Test
    public void whenShowAll() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("One"));
        Item two = tracker.add(new Item("Two"));
        Item three = tracker.add(new Item("Three"));
        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        UserAction[] actions = new UserAction[]{
                new ShowAllAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Меню:" + ln
                        + "0. Показать все заявки" + ln
                        + "1. Выход" + ln
                        + "=== Показать все заявки ===" + ln
                        + one + ln
                        + two + ln
                        + three + ln
                        + "Меню:" + ln
                        + "0. Показать все заявки" + ln
                        + "1. Выход" + ln
                        + "Вы вышли из системы" + ln
        ));
    }

    @Test
    public void whenSearchId() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("One"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(one.getId()), "1"}
        );
        UserAction[] actions = new UserAction[]{
                new SearchIdAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Меню:" + ln
                        + "0. Поиск заявки по идентификатору" + ln
                        + "1. Выход" + ln
                        + "=== Поиск заявки по идентификатору ===" + ln
                        + one + ln
                        + "Меню:" + ln
                        + "0. Поиск заявки по идентификатору" + ln
                        + "1. Выход" + ln
                        + "Вы вышли из системы" + ln
        ));
    }

    @Test
    public void whenSearchNonExistentId() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("One"));
        Input in = new StubInput(
                new String[]{"0", "5", "1"}
        );
        UserAction[] actions = new UserAction[]{
                new SearchIdAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Меню:" + ln
                        + "0. Поиск заявки по идентификатору" + ln
                        + "1. Выход" + ln
                        + "=== Поиск заявки по идентификатору ===" + ln
                        + "Заявка с введенным идентификатором : 5 не найдена." + ln
                        + "Меню:" + ln
                        + "0. Поиск заявки по идентификатору" + ln
                        + "1. Выход" + ln
                        + "Вы вышли из системы" + ln
        ));
    }

    @Test
    public void whenSearchName() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("One"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(one.getName()), "1"}
        );
        UserAction[] actions = new UserAction[]{
                new SearchNameAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Меню:" + ln
                        + "0. Поиск заявки по имени" + ln
                        + "1. Выход" + ln
                        + "=== Поиск заявки по имени ===" + ln
                        + one + ln
                        + "Меню:" + ln
                        + "0. Поиск заявки по имени" + ln
                        + "1. Выход" + ln
                        + "Вы вышли из системы" + ln
        ));
    }

    @Test
    public void whenSearchNonExistentName() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("One"));
        Input in = new StubInput(
                new String[]{"0", "Two", "1"}
        );
        UserAction[] actions = new UserAction[]{
                new SearchNameAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Меню:" + ln
                        + "0. Поиск заявки по имени" + ln
                        + "1. Выход" + ln
                        + "=== Поиск заявки по имени ===" + ln
                        + "Заявки с именем: Two не найдены." + ln
                        + "Меню:" + ln
                        + "0. Поиск заявки по имени" + ln
                        + "1. Выход" + ln
                        + "Вы вышли из системы" + ln
        ));
    }
}