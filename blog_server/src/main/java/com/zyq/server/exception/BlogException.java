package com.zyq.server.exception;

import com.zyq.server.utils.ResultModel;

public class BlogException extends RuntimeException {

    private final ErrorAndMsg response;

    public BlogException(String code) {
        this.response = new ErrorAndMsg(code);
    }
    public BlogException(ErrorAndMsg response) {
        this.response = response;
    }
    public ErrorAndMsg getResponse() {
        return response;
    }

}
