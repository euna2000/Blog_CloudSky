package com.example.cloudsky.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupRequestDto {

    @Pattern(regexp = "^[a-z0-9]{4,10}$", message = "최소 4자 이상, 10자 이하이며 알파벳 소문자(a~z), 숫자(0~9) 로 구성되어야 합니다.")
    private String username;

    @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*\\d)[a-zA-Z0-9]{8,15}$", message = "최소 8자 이상, 15자 이하이며 알파벳 대소문자(a~z, A~Z), 숫자(0~9) 로 구성되어야 합니다.")
    private String password;

    @NotBlank
    private String realname;

    private String introduction;
}
// 회원가입  할 때 이 모양의 json 형식으로 정보를 입력하시면 됩니다.