package ru.job4j.bank;

import java.util.*;
/**
 * Класс описывает работу банковской системы
 * @author Евгений Чеботарев
 * @version 1
 */
public class BankService {
    /**
     * Данные хранятся в коллекции Мар, где ключом является данные класса User,
     * а значение данные класса Account
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя в систему.
     * По умолчанию добавляется пустой список - new ArrayList<Account>().
     * В методе проверяется, что такого пользователя еще нет в системе.
     * @param user параметр типа User.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }
    /**
     * Метод добавляет новый счет к клиенту банка.
     * Ищем клиента по паспорту,
     * если клиент найден, проверяем что такого счета у него нет,
     * добавляем счет
     * @param passport входящий параметр номера паспорта типа String
     * @param account входящий параметр счета клиента типа Account
     */

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null && !users.get(user).contains(account)) {
            users.get(user).add(account);
        }
    }
    /**
     * Метод ищет пользователя по номеру паспорта.
     * @param passport входящий параметр номера паспорта.
     * @return возвращает значение: если клиент найден - объект типа User, если не найден - null.
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (passport.equals(user.getPassport())) {
                return user;
            }
        }
        return null;
    }*/

    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }
    /**
     * Метод осуществляет поиск клиента по реквизитам.
     * Ищем клиента по номеру паспорта.
     * Затем получаем список всех счетов этого клиента List<Account> accounts,
     * и в этом списке ищем нужный счет.
     * @param passport входящий параметр номера паспорта клиента типа String
     * @param requisite входящий параметр реквизитов счета типа String
     * @return возвращает найденный счет клиента типа Account, если счет не найден возвращает null
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            for (Account account : users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }*/

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(account -> account.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    public void deleteUser(User user) {
        users.remove(user);
    }
    /**
     * Метод выполняет перечисление денег с одного счета на другой счет.
     * Если счет не найден или не хватает денег на счёте srcAccount (с которого переводят),
     * то метод должен возвращает false.
     * @param srcPassport номер паспорта клиента, который переводит
     * @param srcRequisite номер счета клиента, с которого переводят
     * @param destPassport номера паспорт клиента, которому переводят
     * @param destRequisite номер счета клиента, на который переводят
     * @param amount параметр суммы типа double (сумма перевода)
     * @return возвращаемое логическое значение (true в случае успеха, false - в случае неуспеха).
     */

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account src = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, destRequisite);
        if (src != null && dest != null && src.getBalance() >= amount) {
            src.setBalance(src.getBalance() - amount);
            dest.setBalance(dest.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
