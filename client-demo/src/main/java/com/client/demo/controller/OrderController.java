package com.client.demo.controller;

import com.client.demo.req.OrderReq;
import com.common.enums.ResponseEnum;
import com.common.model.R;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
public class OrderController {


    @PostMapping("/order/orderInit")
    public Object orderInit(@RequestBody @Valid OrderReq req,BindingResult result){
        if(result.hasErrors()){
            return new R(-9999,result.getAllErrors().get(0).getDefaultMessage());
        }
        return new R(ResponseEnum.SUCCESS_RESPONSE,req);
    }

}
