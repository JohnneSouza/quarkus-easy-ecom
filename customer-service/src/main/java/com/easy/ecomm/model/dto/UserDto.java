package com.easy.ecomm.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    @NotBlank(message = "password must be filled")
    private String password;
    @NotBlank(message = "email must be filled")
    private String email;
    @NotBlank(message = "firstName must be filled")
    private String firstName;
    private String lastName;

}
