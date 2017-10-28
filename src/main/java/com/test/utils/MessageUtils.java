package com.test.utils;

/**
 * @author Created by pangkunkun on 2017/10/28.
 */
public class MessageUtils {
    public static BasicResponse buildSuccessResponse(Object object){
        BasicResponse response=new BasicResponse(HttpStatus.SUCCESS,object);
        return response;
    }

    public static BasicResponse buildSuccessResponse() {
        BasicResponse response = new BasicResponse(HttpStatus.SUCCESS);
        return response;
    }

    public static BasicResponse buildFailedReposnse(HttpStatus status) {
        BasicResponse response = new BasicResponse(status);
        return response;
    }
}
