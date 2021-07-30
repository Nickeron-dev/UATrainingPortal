package ua.testing.registration_form.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class User {

    private Long id;

    private String names;

    private String email;

    private String login;

    private String password;

}
