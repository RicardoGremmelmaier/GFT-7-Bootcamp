package gradle.project.model;

import java.time.LocalDate;

@Data
public class UserModel {

    private int code;
    private String userName;
    private LocalDate birthDate;
}

