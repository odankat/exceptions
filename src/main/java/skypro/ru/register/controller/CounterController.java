package skypro.ru.register.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import skypro.ru.register.logic.User;


@RestController
public class CounterController {
    private static final String VALIDATE_PATTERN = "^[a-zA-Z0-9-_]+$";
    @GetMapping
    public String Hello() {
        return "Скопируй это и вставь в адрессную строчку - http://localhost:8080/register?login=zalupa&password=qwert123&confirmPassword=qwerty123";
    }

    @GetMapping("register")
    public static void register(@RequestParam("login") String login, @RequestParam("password") String password,
                                @RequestParam("confirmPassword") String confirmPassword) {
        User user = new User(login, password, confirmPassword);
        user.check();
    }
}