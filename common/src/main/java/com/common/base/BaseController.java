package com.common.base;

import com.common.exception.GeneralException;
import com.common.util.StringUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BaseController {
    public void exception(Exception e,String requestMethod) {
        log.error(StringUtils.format("請求方法[{0}]拋出異常信息:{1}",requestMethod,e.getMessage()));
        throw new GeneralException(requestMethod,e);
    }
}
