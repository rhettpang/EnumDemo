package com.test.utils;

/**
 * @author Created by pangkunkun on 2017/10/28.
 */
public enum HttpStatus {
    SUCCESS(0,"success"),
    GET_MESSAGE_ERROR(1,"Fail to get message");

    private final int code;
    private final String message;

    HttpStatus(int code,String message){
        this.code=code;
        this.message=message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
