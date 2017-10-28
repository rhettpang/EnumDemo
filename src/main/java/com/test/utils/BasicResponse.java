package com.test.utils;

/**
 * @author Created by pangkunkun on 2017/10/28.
 */
public class BasicResponse {

    int    code     =  0;
    String message ="";
    Object  data ="";

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public BasicResponse(int code,String message){
        this.message=message;
        this.code = code;
    }

    public BasicResponse(HttpStatus status, Object object){
        this.message=status.getMessage();
        this.code = status.getCode();
        this.data=object;
    }

    public BasicResponse(HttpStatus status){
        this.message=status.getMessage();
        this.code = status.getCode();
    }
}
