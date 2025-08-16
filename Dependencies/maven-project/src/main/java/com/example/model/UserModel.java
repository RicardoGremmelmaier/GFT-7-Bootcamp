package com.example.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class UserModel {

    private int code;
    private String userName;
    private LocalDate birthDate;
}
