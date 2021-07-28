package ua.testing.registration_form.service;

import org.springframework.stereotype.Service;
import ua.testing.registration_form.dto.UserDTO;

@Service
public class LoginFormService {
    public String inputUser(UserDTO name) {
        System.out.println("Service:" + name);
        return "";
    }
}
