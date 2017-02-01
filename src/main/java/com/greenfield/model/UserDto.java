package com.greenfield.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UserDto {

    @NotNull(message = "Не может быть пусто")
    @Size(min = 2, max = 10)
    private String name;

}
