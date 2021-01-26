package com.zyq.blog.exception;

public class ErrorAndMsg {

    private String code;
    private String msg;

    public ErrorAndMsg(String code ,String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ErrorAndMsg(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
