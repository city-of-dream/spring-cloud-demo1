package com.client.demo.controller;

import com.client.demo.feign.FeignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ClientController {

    @Resource
    private FeignService feignService;

    @RequestMapping(method = RequestMethod.GET,value = "/demo")
    public Object demo(){
        return feignService.getStores();
    }


}
