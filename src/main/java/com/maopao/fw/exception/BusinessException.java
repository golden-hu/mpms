package com.maopao.fw.exception;

/**
 * Created by hugo on 2017/6/22.
 */
public class BusinessException extends Exception{
    private static final long serialVersionUID = -5728437203705004795L;

    public BusinessException(String message){
        super(message);
    }

    public BusinessException(String message,Exception e){
        super(message,e);
    }
}
