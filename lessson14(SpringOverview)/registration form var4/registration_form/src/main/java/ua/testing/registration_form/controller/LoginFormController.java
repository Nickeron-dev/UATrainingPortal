package ua.testing.registration_form.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ua.testing.registration_form.dto.UserDTO;
import ua.testing.registration_form.service.LoginFormService;
import ua.testing.registration_form.service.RegFormService;

@Slf4j
@RestController
@RequestMapping(value = "/")
public class LoginFormController {

    private final LoginFormService loginFormService;

    @Autowired
    public LoginFormController(LoginFormService loginFormService) {
        this.loginFormService = loginFormService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public void loginFormController(UserDTO user){
        loginFormService.inputUser(user);
        log.info("{}", user);
    }
}
