package com.client.demo.controller;

import com.client.demo.req.OrderReq;
import com.common.enums.ResponseEnum;
import com.common.model.R;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.validation.Validator;



@RestController
@RequestMapping("/order")
public class OrderController {

//    @Resource
//    private Validator validator;

    @PostMapping("/orderInit")
    public Object orderInit(@RequestBody @Valid OrderReq req,BindingResult result){
        return new R(ResponseEnum.SUCCESS_RESPONSE,req);
    }

}
