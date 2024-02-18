package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        boolean a = true;
        for (int i = 0; i < users.length; i++) {
            if (!users[i].getUsername().equals(login)) {
                a = false;
            } else {
                a = true;
            }

        }
        if (!a) {
            throw new UserNotFoundException();
        }
        return null;
    }

    public static boolean validate(User user) throws UserInvalidException {
        int nameLength = user.getUsername().length();
        if (!user.isValid() && nameLength < 3) {
            throw new UserInvalidException();
        }
           return false;
    }

        public static void main (String[]args) {
            User[] users = {
                    new User("Petr Arsentev", true)
            };
            User user = null;
            try {
                user = findUser(users, "Petr Arsentev");
                if (validate(user)) {
                    System.out.println("This user has an access");
                }
            }  catch (UserInvalidException a) {
                System.out.println("Пользователь не валидный");
            } catch (UserNotFoundException e) {
                System.out.println("Пользователя не найдено");
            }
        }

}