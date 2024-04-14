package com.blog.dto;

import jakarta.validation.constraints.Pattern;
import lombok.Getter;

@Getter
public class LoginRequestDto {

    @Pattern(regexp = "^^[a-z0-9]{4,10}$", message = "최소 4자 이상, 10자 이하 및 알파벳 소문자 및 숫자로 구성해야 합니다")
    private String username;

    private String nickname;

    private boolean admin = false;

    private String adminToken = "";

    @Pattern(regexp = "^[a-zA-Z0-9@$!%*?&]{8,15}$", message = "최소 8자 이상, 15자 이하 및 알파벳 대소문자 숫자 특수문자로 구성해야 합니다")
    private String password;


}
