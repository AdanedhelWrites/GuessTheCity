package com.adanedhel.exception;

import lombok.Getter;

@Getter
public class SehirServisException extends RuntimeException{
    private final ErrorType type;

    public SehirServisException(ErrorType type){
        super(type.getMesaj());
        this.type=type;
    }
    public SehirServisException(ErrorType type, String mesaj){
        super(mesaj);
        this.type=type;
    }

}
