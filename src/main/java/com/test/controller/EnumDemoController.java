package com.test.controller;

import com.test.utils.HttpStatus;
import com.test.utils.MessageUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Created by pangkunkun on 2017/10/28.
 */
@RestController
public class EnumDemoController {

    private final static Logger log= LoggerFactory.getLogger(EnumDemoController.class);

    @GetMapping("/success")
    public Object testSuccess(){
        log.info("This is success test");
        return MessageUtils.buildSuccessResponse();
    }

    @GetMapping("/success/data")
    public Object testSuccessWithData(){
        log.info("This is success test,and return with data");
        Object object="This is your return data";
        return MessageUtils.buildSuccessResponse(object);
    }


    @GetMapping("/error/test")
    public Object testError(){
        log.info("This is error test");
        return MessageUtils.buildFailedReposnse(HttpStatus.GET_MESSAGE_ERROR);
    }
}
