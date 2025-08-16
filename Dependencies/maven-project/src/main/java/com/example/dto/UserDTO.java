package com.example.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class UserDTO {

    private int id;
    private String name;
    private LocalDate birthDate;
}
