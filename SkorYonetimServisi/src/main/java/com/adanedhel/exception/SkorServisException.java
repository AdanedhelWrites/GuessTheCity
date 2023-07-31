package com.adanedhel.exception;

import lombok.Getter;

@Getter
public class SkorServisException extends RuntimeException{
    private final ErrorType type;

    public SkorServisException(ErrorType type){
        super(type.getMesaj());
        this.type=type;
    }
    public SkorServisException(ErrorType type, String mesaj){
        super(mesaj);
        this.type=type;
    }

}
