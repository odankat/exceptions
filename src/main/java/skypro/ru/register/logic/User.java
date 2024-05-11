package skypro.ru.register.logic;
import skypro.ru.register.exception.WrongLoginException;
import skypro.ru.register.exception.WrongPasswordException;

public class User {
    String login;
    String password;
    String confirmPassword;

    public User(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public void check() {


        if (login.matches("[a-zA-Z0-9_]+") && login.length() <= 20) {
            System.out.println("Логин правильный");
        } else {

            System.out.println("логин не правильный");
        }
        if (password.equals(confirmPassword) == true && password.matches("[a-zA-Z0-9_]+") && password.length() <= 20 ) {

            System.out.println("Заебись");
        } else {

        }
        try {
        } catch (WrongLoginException e){
            System.out.println("логин хуйня");
        }
        try {

        }
        catch (WrongPasswordException e) {
            System.out.println("пароль хуйня");
        }

    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }
}

