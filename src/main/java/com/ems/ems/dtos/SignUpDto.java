package com.ems.ems.dtos;

import com.ems.ems.enums.UserRole;

public record SignUpDto(
                String login,
                String password,
                UserRole role) {
}