package com.client.demo.exception;

import com.common.model.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@RestController
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler
    public R handle(Exception exception) {
        if(exception instanceof GeneralException){
            GeneralException ge = (GeneralException) exception;
            return new R(-9999,ge.getMsg());
        }
        log.info(exception.getMessage());
        return new R(-9999,"系统错误");
    }
}
