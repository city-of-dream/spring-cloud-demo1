package com.common.model;

import com.common.enums.ResponseEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class R<T> {
    private int code;
    private String msg;
    private T resData;

    public R() {
    }

    public R(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public R(ResponseEnum responseEnum) {
        this.code = responseEnum.getCode();
        this.msg = responseEnum.getMsg();
    }

    public R(int code, String msg, T resData) {
        this.code = code;
        this.msg = msg;
        this.resData = resData;
    }
    public R(ResponseEnum responseEnum, T resData) {
        this.code = responseEnum.getCode();
        this.msg = responseEnum.getMsg();
        this.resData = resData;
    }


}
