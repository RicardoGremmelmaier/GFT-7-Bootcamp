package com.example;

import java.time.LocalDate;
import org.mapstruct.factory.Mappers;
import com.example.dto.UserDTO;
import com.example.mapper.UserMapper;
import com.example.model.UserModel;

public class Main {

    private final static UserMapper mapper = Mappers.getMapper(UserMapper.class);

    public static void main(String[] args) {
        var model = new UserModel();
        model.setCode(1);
        model.setUserName("Julia Appel");
        model.setBirthDate(LocalDate.now().minusYears(21));
        System.out.println(mapper.toDto(model));

        var dto = new UserDTO();
        dto.setId(2);
        dto.setName("Ricardo Gremmelmaier");
        dto.setBirthDate(LocalDate.now().minusYears(25));
        System.out.println(mapper.toModel(dto));
    }
}