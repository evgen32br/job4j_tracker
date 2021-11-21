package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (User value : users) {
            if (login.equals(value.getUsername())) {
                user = value;
                break;
            }
        }
        if (user == null) {
            throw new UserNotFoundException();
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException();
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr", true)
        };
        try {
            User user = findUser(users, "Petr");
            if (validate(user)) {
                System.out.println(user.getUsername());
                System.out.println("Этот пользователь имеет доступ");
            }
        } catch (UserInvalidException q) {
            System.out.println("Пользователь не валидный");
        } catch (UserNotFoundException n) {
            System.out.println("Пользователь не найден");
        }
    }
}
