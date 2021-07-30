package ua.testing.demo_jpa.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.testing.demo_jpa.dto.UserDTO;
import ua.testing.demo_jpa.dto.UsersDTO;
import ua.testing.demo_jpa.entity.User;
import ua.testing.demo_jpa.repository.UserRepository;

@Slf4j
@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UsersDTO getAllUsers() throws Exception {
        if (userRepository.findAll().isEmpty()) {
            throw new Exception("Repository is empty");
        }
        return new UsersDTO(userRepository.findAll());
    }

    public User findByUserLogin (UserDTO userDTO) throws Exception {
        return userRepository.findByEmail(userDTO.getEmail()).orElseThrow(Exception::new);
    }

    public void saveNewUser (User user) throws Exception {
        if (userRepository.findAll().stream().anyMatch(element -> element.getEmail() == user.getEmail())) {
            throw new Exception("This email is already used");
        }

        try {
            userRepository.save(user);
        } catch (Exception ex){
            log.info("{Почтовый адрес уже существует}");
        }

    }


}
