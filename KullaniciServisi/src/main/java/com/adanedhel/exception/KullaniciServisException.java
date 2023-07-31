package com.adanedhel.exception;

import lombok.Getter;

@Getter
public class KullaniciServisException extends RuntimeException{
    private final ErrorType type;

    public KullaniciServisException(ErrorType type){
        super(type.getMesaj());
        this.type=type;
    }
    public KullaniciServisException(ErrorType type, String mesaj){
        super(mesaj);
        this.type=type;
    }

}
