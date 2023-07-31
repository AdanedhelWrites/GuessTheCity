package com.adanedhel.exception;

import lombok.Getter;

@Getter
public class TahminServisException extends RuntimeException{
    private final ErrorType type;

    public TahminServisException(ErrorType type){
        super(type.getMesaj());
        this.type=type;
    }
    public TahminServisException(ErrorType type, String mesaj){
        super(mesaj);
        this.type=type;
    }

}
