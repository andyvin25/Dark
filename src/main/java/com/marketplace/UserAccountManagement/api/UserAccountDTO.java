package com.marketplace.UserAccountManagement.api;

import tools.jackson.databind.PropertyNamingStrategies;
import tools.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record UserAccountDTO(
        String id,
        String email,
        String userName
) {
}