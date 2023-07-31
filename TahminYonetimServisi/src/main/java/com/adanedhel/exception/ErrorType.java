package com.adanedhel.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ErrorType {
    INVALID_PARAMETER(3001,"Geçersiz parametre girişi yaptınız",HttpStatus.BAD_REQUEST),
    BAD_REQUEST(5001,"Geçersiz istek" ,HttpStatus.BAD_REQUEST ),
    INTERNAL_ERROR_SERVER(5100,"Sunucu Hatası",INTERNAL_SERVER_ERROR);

    private int code;
    private String mesaj;
    private HttpStatus status;
}
