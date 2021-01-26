package com.zyq.blog.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.ResourceBundle;

@ControllerAdvice
@Slf4j
public class BlogExceptionHandle {

    @ExceptionHandler(BlogException.class)
    @ResponseBody
    public ErrorAndMsg blogException(HttpServletRequest request ,BlogException ex) throws UnsupportedEncodingException {
        ErrorAndMsg errorAndMsg;
        ResourceBundle bundle = ResourceBundle.getBundle("ErrorCodeConst");
        String msg = "" + new String(bundle.getString(ex.getResponse().getCode()).getBytes("ISO-8859-1"),"utf-8");
        log.error("BlogException code:{} msg:{}",ex.getResponse().getCode(),msg);
        System.out.println("Cause: " + ex.getClass().getName() + ":" + msg);
        StackTraceElement[] stackTrace = ex.getStackTrace();
        for (StackTraceElement s : stackTrace) {
            System.out.println("    " + s.toString());
        }
        errorAndMsg = new ErrorAndMsg(ex.getResponse().getCode(),msg);
        return errorAndMsg;
    }

}
