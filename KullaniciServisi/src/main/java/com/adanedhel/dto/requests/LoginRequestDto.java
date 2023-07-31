package com.adanedhel.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequestDto {
    @NotBlank(message = "kullanici adinizi giriniz")
    private String username;
    @NotBlank(message = "sifrenizi giriniz")
    private String password;
}
