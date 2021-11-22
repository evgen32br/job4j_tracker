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
            throw new UserNotFoundException("Пользователь не найден");
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("Пользователь не валидный");
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
        } catch (UserInvalidException uie) {
            uie.printStackTrace();
        } catch (UserNotFoundException unfe) {
           unfe.printStackTrace();
        }
    }
}
