package com.common.enums;



public enum ResponseEnum {
    SUCCESS_RESPONSE(0,"success response"),
    FAIL_RESPONSE(-9999,"fail response"),
    INVALID_REQUEST(201,"参数校验失败");


    private int code;
    private String msg;

    ResponseEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
