package com.client.demo.exception;

import com.common.model.R;
import org.springframework.web.bind.annotation.*;


@RestController
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public R handle(Exception exception) {
        if(exception instanceof GeneralException){
            GeneralException ge = (GeneralException) exception;
            return new R(-9999,ge.getMsg());
        }
        return new R(-9999,"bad request, ");
    }
}
