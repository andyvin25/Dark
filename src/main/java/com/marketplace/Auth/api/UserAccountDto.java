package com.marketplace.Auth.api;

import org.springframework.aot.hint.annotation.RegisterReflectionForBinding;

import com.marketplace.Auth.domain.Role;

import java.util.Set;

@RegisterReflectionForBinding
public record UserAccountDto(String email
        , Set<Role.RoleEnum> roles
) {
}
