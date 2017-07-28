package com.maopao.fw.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by hugo on 2017/6/22.
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public ExceptionInfo<String> jsonExceptionHandler(HttpServletRequest req,BusinessException e){
        ExceptionInfo<String> r = new ExceptionInfo<>();
        r.setMessage(e.getMessage());
        r.setCode(ExceptionInfo.ERROR);
        r.setData("Some Data");
        r.setUrl(req.getRequestURL().toString());
        return r;
    }
}
