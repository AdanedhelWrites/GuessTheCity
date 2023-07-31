package com.adanedhel.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequestDto {
    @NotBlank(message = "Bos gecme burayi")
    private String username;
    @Email(message = "Gecerli email adresi lutfen")
    private String email;
    @NotBlank(message = "Bos gecme burayi")
    private String password;
}
