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
public class CreateRequestDto {
    @NotBlank(message = "Sehrin ismini giriniz!!")
    private String name;
    private String bolge;
}
