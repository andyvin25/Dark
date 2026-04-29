package com.marketplace.UserAccountManagement.api;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import tools.jackson.databind.PropertyNamingStrategies;
import tools.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record UserAccountUpdateDTO(
    @NotBlank(message = "Invalid email: empty null")
    @Email(message = "Invalid Email")
    String email,

    @NotBlank(message = "name can't be empty")
    String name
) {}
