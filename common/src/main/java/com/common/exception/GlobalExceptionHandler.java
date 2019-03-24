package com.common.exception;

import com.common.enums.ResponseEnum;
import com.common.model.R;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Set;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public R handle(Exception exception) {
        if(exception instanceof ConstraintViolationException){
            ConstraintViolationException exs = (ConstraintViolationException) exception;
            Set<ConstraintViolation<?>> violations = exs.getConstraintViolations();
            for (ConstraintViolation<?> item : violations) {
                /**打印验证不通过的信息*/
                System.out.println(item.getMessage());
                return new R(-7777,item.getMessage());
            }
        }else if(exception instanceof GeneralException){
            return new R(ResponseEnum.INVALID_REQUEST);
        }
        return new R(ResponseEnum.FAIL_RESPONSE) ;
    }
}
