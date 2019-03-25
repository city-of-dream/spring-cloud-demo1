package com.client.demo.exception;

import com.common.enums.ResponseEnum;

public class GeneralException extends RuntimeException {

    private ResponseEnum responseEnum;

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public GeneralException(ResponseEnum responseEnum) {
        this.responseEnum = responseEnum;
    }

    public GeneralException(String msg) {
        this.msg = msg;
    }

    public ResponseEnum getResponseEnum() {
        return responseEnum;
    }

    public void setResponseEnum(ResponseEnum responseEnum) {
        this.responseEnum = responseEnum;
    }
}
