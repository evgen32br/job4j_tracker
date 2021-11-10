package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Вот мы в автобусе сидим" + System.lineSeparator()
                + "И сидим, и сидим" + System.lineSeparator()
                + "И из окошечка глядим" + System.lineSeparator()
                + "Всё глядим!" + System.lineSeparator()
                + "Глядим назад, глядим вперёд" + System.lineSeparator()
                + "Вот так вот, вот так вот" + System.lineSeparator()
                + "Ну что ж автобус не везёт" + System.lineSeparator()
                + "Не везёт?" + System.lineSeparator()
                + "Колёса закружились" + System.lineSeparator()
                + "Вот так вот, вот так вот" + System.lineSeparator()
                + "Вперёд мы покатились" + System.lineSeparator()
                + "Вот так вот!" + System.lineSeparator()
                + "А щётки по стеклу шуршат" + System.lineSeparator()
                + "Вжик-вжик-вжик, вжик-вжик-вжик" + System.lineSeparator()
                + "Все капельки смести хотят" + System.lineSeparator()
                + "Вжик-вжик-вжик!" + System.lineSeparator()
                + "И мы не просто так сидим" + System.lineSeparator()
                + "Бип-бип-бип, Бип-бип-бип," + System.lineSeparator()
                + "Мы громко-громко все гудим" + System.lineSeparator()
                + "Бип-бип-бип!" + System.lineSeparator()
                + "Пускай автобус нас трясёт" + System.lineSeparator()
                + "Вот так вот, вот так вот" + System.lineSeparator()
                + "Мы едем-едем всё вперёд" + System.lineSeparator()
                + "Вот так вот!");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Количество сидячих мест " + count);
        System.out.println("Количество стоячих мест " + (count * 1000000));
    }

    @Override
    public double refuel(int fuel) {
        return 48.50 * fuel;
    }
}
